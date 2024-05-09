package dev.challenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void pricedLineItem(int quantity) {
        System.out.println(quantity + " of " + type + " costs " + price);
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", quantity, price, type,description);
    }
    public abstract void showDetails();
}
