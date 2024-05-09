package dev.challenge;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale productForSale) {
    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }
}

public class Store {
    private static final ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Painting", 1380, " Impressionistic work by Leanardo in 2010"));
        storeProducts.add(new ArtObject("Painting", 1540, " Artistic work by Leanardo in 2015"));
        listProducts();
        System.out.println("order1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);


    }
    public static void listProducts(){
        for(var item :storeProducts){
            System.out.println("--".repeat(15));
            item.showDetails();
            item.pricedLineItem(10);
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order){
            item.productForSale().pricedLineItem(item.quantity());
            salesTotal += item.productForSale().getSalesPrice(item.quantity());
        }
        System.out.println("sales total" + salesTotal);
    }
}
