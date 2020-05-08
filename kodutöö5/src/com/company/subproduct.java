package com.company;

public class subproduct extends product {
    private int number;
    private vendor vendor;
    private Boolean NSFW=Boolean.TRUE; // NSFW = Not Safe For Work


    public subproduct(int number, String name, int quantity, double price, vendor vendor) {
        super(name, quantity, price);
        this.number = number;
        this.vendor = vendor;
    }
@Override
    public String toString() {
        return "ProductTable{" +
                "number=" + number +
                ", name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + getPrice() +
                ", inventory value(w/ fee)=" + inventoryValue() +
                ", NSFW=" + NSFW + ((vendor != null) ? vendor.toString() : "not assigned") + "}";
    }

    public double inventoryValue(){
        return getQuantity()*getPrice()*1.05;
    }
}
