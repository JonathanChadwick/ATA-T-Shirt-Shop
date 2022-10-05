package com.ata;

class Product {
    private final String name;
    private final double price;
    private final int iD;

    /**
     * Constructor class.
     * @param name of product
     * @param price of product
     * @param iD of product
     */
    Product(String name, double price, int iD) {
        this.name = name;
        this.price = price;
        this.iD = iD;
    }

    /**
     * Product Name getter.
     * @return product name
     */
    public String getName() {
        return name;
    }

    /**
     * Product price getter.
     * @return product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Product ID getter.
     * @return product ID as int
     */
    public int getiD() {
        return iD;
    }
}
