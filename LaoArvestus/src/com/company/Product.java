package com.company;

import java.util.Objects;

public class Product {

    private String name;
    private int size;

    public Product(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name + size);
    }

/*    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (obj == this) return true;
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (User) obj;
        return size == product.size &&
                Objects.equals(name, product.name) &&

        }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Product))
            return false;

        Product product = (Product) obj;

        return size == product.getSize() &&
                name.equals(product.getName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
