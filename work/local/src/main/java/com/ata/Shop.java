package com.ata;

import java.util.ArrayList;

class Shop {
    private final ArrayList<Product> products;
    private Cart cart;

    Shop(ArrayList<Product> products) {
        this.products = products;
        this.cart = new Cart();
    }

    /**
     *Prints the list of products.
     */
    public void printProducts() {
        System.out.println("--Products--");

        for (Product product : products) {
            System.out.printf("ID %d: %s - $%.2f%n",
                    product.getiD(), product.getName(), product.getPrice());
        }
    }

    /**
     *Return index of the product matching the searchText If no match returns -1.
     *@param searchText the user input for the product search
     *@return index of item or -1 for no result
     */
    public int findProduct(String searchText) {
        for (Product product : products) {
            if (searchText.equals(product.getName())) {
                return product.getiD();
            }
        }
        return -1;
    }

    public int findId(int searchID) {
        for (Product product : products) {
            if (searchID == product.getiD()) {
                return products.indexOf(product);
            }
        }
        return -1;
    }

    public String addToCart(int productIndex) {
        cart.addItem(products.get(productIndex));
        return products.get(productIndex).getName();
    }

    public void checkout()  {
        cart.checkout();
    }

    public void printCart() {
        cart.showDetails();
    }

}
