package app.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItem;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;
    private final SimpleDateFormat LOCAL_DATE_FORMAT = new SimpleDateFormat("dd 'de' MMMM yyyy");

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItem < MAX_ITEMS)
            this.items[indiceItem++] = item;
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item != null)
                total += item.calcularImporte();
        }
        return total;
    }

    public StringBuilder generarDetalle() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Factura No. ")
                .append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getName())
                .append("\tNIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\nFecha Emision: ")
                .append(LOCAL_DATE_FORMAT.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$Cant.\tTotal\n");
        for(ItemFactura item : items){
            if(item != null){
                sb
                        .append(item.getProducto().getSku())
                        .append("\t")
                        .append(item.getProducto().getName())
                        .append("\t")
                        .append(item.getProducto().getPrice())
                        .append("\t")
                        .append(item.getCantidad())
                        .append("\t")
                        .append(item.calcularImporte())
                        .append("\n");
            }
        }
        return sb
                .append("\nGran Total: ")
                .append(calcularTotal());
    }
}
