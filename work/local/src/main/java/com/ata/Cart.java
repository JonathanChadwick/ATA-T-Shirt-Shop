package com.ata;

import java.util.ArrayList;

class Cart {
    private ArrayList<Product> items = new ArrayList<>();
    private double total;
    private double taxRate = 10.00;


    /**
     * @param p product to add to the cart
     */
    public void addItem(Product p) {
        items.add(p);
        total += p.getPrice();
    }



    public void showDetails() {
        switch (items.size()) {
            case 0:
                System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
                break;
            default:
                double postTaxTotal = ((taxRate / 100) * total) + total;
                System.out.printf("--Cart--%n");
                System.out.printf("Item Count: %d%n", items.size());
                System.out.printf("Items:%n");
                for (Product item : items) {
                    System.out.printf("%s: $%.2f%n", item.getName(), item.getPrice());
                }
                System.out.printf("%nPre-Tax Total: $%.2f%n", total);
                System.out.printf("Post-Tax Total (%.2f%% Tax): $%.2f%n", taxRate, postTaxTotal);
                break;
        }
    }


    public void checkout() {
        switch (items.size()) {
            case 0:
                System.out.println("Your cart is currently empty. Please add at least one product to check out.");
                break;
            default:
                System.out.printf("Your total is $%.2f%n", total);
                System.out.println("Thank you for shopping at T-Shirt Mart.");
                empty();
                break;
        }
    }

    private void empty() {
        items.clear();
        total = 0.00;
    }



}

