package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] productForSales = new ProductForSale[3];
        Chocolate chocolate = new Chocolate("dark orange", 25.00, "dark chocolate with orange flavor");
        Bread bread = new Bread("rustic", 15.00, "village bread made from buckwheat flour");
        Coke coke = new Coke("zero", 10.00, "bottled sugar free cola with sweetener");

        productForSales[0] = chocolate;
        productForSales[1] = bread;
        productForSales[2] = coke;

        listProducts(productForSales);

    }

    public static void listProducts(ProductForSale[] products) {

    }
}