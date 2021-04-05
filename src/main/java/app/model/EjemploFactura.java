package app.model;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("555-55");
        cliente.setName("Davids");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese product N° " + producto.getSku() + ": ");
            nombre = s.nextLine();
            producto.setName(nombre);

            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrice(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
