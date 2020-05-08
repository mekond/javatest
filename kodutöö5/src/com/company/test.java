package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);
    private static Hashtable<Integer, product> products = new Hashtable<>();
    private static Hashtable<String, subproduct> productsTable = new Hashtable<>();

    private static void addProduct(product product, int units) {
        if (products.containsKey(product.getNumber())) {
            product.setQuantity(product.getQuantity() + units);
            products.put(product.getNumber(), product);
        } else {
            addToProducts(product);
        }
    }

    private static void addToProducts(product product) {
        products.put(product.getNumber(), product);
    }

    private static void addToProductsMovie(subproduct productMovie) {
        if (productsTable.containsKey(productMovie.getName())) {
            productsTable.get(productMovie.getName()).setQuantityAdd(productMovie.getQuantity());
        } else {
            productsTable.put(productMovie.getName(), productMovie);
        }
    }

    private static void createNewProduct() {
        System.out.println("Add product ( y / n )?");
        if (scan.nextLine().equals("y")) {
            String name;
            int units;
            double price;
            System.out.println("Insert product name: ");
            name = scan.nextLine();
            System.out.println("Insert product quantity (int): ");
            units = scan.nextInt();
            scan.nextLine();
            System.out.println("Insert product price (double): ");
            price = scan.nextDouble();
            scan.nextLine();
            addToProducts(new product(name, units, price));
        }
    }

    private static void addVendor() {
        System.out.println("Add a new vendor to a product ( y / n )?");
        if (scan.nextLine().equals("y")) {
            vendor vendor = new vendor();
            System.out.println("Which product number? (int) ");
            product product = products.get(scan.nextInt());
            scan.nextLine();
            System.out.println("Insert vendor name: ");
            vendor.setName(scan.nextLine());
            System.out.println("Insert vendor address: ");
            vendor.setAddress(scan.nextLine());
            System.out.println("Insert vendor contact: ");
            vendor.setRepname(scan.nextLine());
            System.out.println("Insert vendor number (int): ");
            vendor.setPhoneNumb(scan.nextInt());
            scan.nextLine();
            product.setVendor(vendor);
        }
    }

    private static void addMoreProduct() {
        System.out.println("Add more already existing product? ( y / n )");
        if (scan.nextLine().equals("y")) {
            int key;
            int units;
            System.out.println("What is product number? (int)");
            key = scan.nextInt();
            scan.nextLine();
            System.out.println("How many? (int)");
            units = scan.nextInt();
            scan.nextLine();
            addProduct(products.get(key), units);
        }
    }

    private static void listProducts() {
        System.out.println("List products that are NSFW? ( y / n )");
        if (scan.nextLine().equals("y")) {

            for (Integer key : products.keySet()) {
                subproduct output = new subproduct(key, products.get(key).getName(), products.get(key).getQuantity(),
                        products.get(key).getPrice(), products.get(key).getVendor());
                System.out.println(output.toString());
            }
        } else {
            for (Integer key : products.keySet()) {
                System.out.println(products.get(key).toString());
            }
        }
    }

    public static void main(String[] args) {

        product ferrari = new product("Ferrari", 1, 9999.99);
        product bmw = new product("BMW", 2, 543012);
        product audi = new product("Audi", 3, 1.53);
        product alfa = new product("Alfa Romeo", 4, 5.70);
        product mercedes = new product("Mercedes", 5, 98.20);
        product infinity = new product("Infinity", 6, 45.80);

        addToProducts(ferrari);
        addToProducts(bmw);
        addToProducts(audi);
        addToProducts(alfa);
        addToProducts(mercedes);
        addToProducts(infinity);

        while (true) {
            createNewProduct();
            addMoreProduct();
            addVendor();
            listProducts();
            System.out.println("continue? ( y / n )");
            while (!scan.nextLine().equals("n"));
        }
    }
}
