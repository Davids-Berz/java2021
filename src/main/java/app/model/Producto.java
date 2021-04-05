package app.model;

import java.math.BigDecimal;

public class Producto {

    private int sku;
    private String name;
    private float price;
    private static int ultimoSku;

    public Producto() {
        this.sku = ++ultimoSku;
    }

    public int getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
