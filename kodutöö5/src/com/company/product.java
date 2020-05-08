package com.company;

public class product {
    private int number;
    private vendor vendor;
    private int quantity;
    private double price;
    private String name;
    static int count = 0;

    public product(String name, int quantity, double price) {
        count++;
        this.number = count;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
@Override
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", inventory value=" + inventoryValue() +
                ", vendor=" + ((vendor != null) ? vendor.getName() : "not assigned");
    }

    public double inventoryValue(){
        return quantity*price;
    }

    public void setVendor(vendor vendor) {
        this.vendor = vendor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantityAdd(int quantity) {
        this.quantity += quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public vendor getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}