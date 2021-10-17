/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

public class Product implements Comparable<Product>{
    /*A class that stores three things: a name, a price, and a quantity, in addition to their respective get methods
    and a constructor.*/
    private static final double DOUBLE_DIFFERENCE_DELTA = 0.000001;
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String nameIn, double priceIn, int quantityIn) {
        this.name = nameIn;
        this.price = priceIn;
        this.quantity = quantityIn;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    public int quantity() {
        return quantity;
    }

    /*Implementing compareTo because without, the test cases don't work properly. In addition, also implementing equals
    and hashCode, since they need to be overwritten as a trio.*/
    public int compareTo(Product otherProduct) {
        if(this.name().compareTo(otherProduct.name()) == 0) {
            if(Math.abs(this.price() - otherProduct.price()) < DOUBLE_DIFFERENCE_DELTA) {
                return this.quantity() - otherProduct.quantity();
            } else {
                return (int) Math.abs(this.price() - otherProduct.price());
            }
        } else {
            return this.name().compareTo(otherProduct.name());
        }
    }

    public boolean equals(Object otherProduct) {
        if(otherProduct != null && otherProduct.getClass() == this.getClass()) {
            return this.compareTo((Product) otherProduct) == 0;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return name.hashCode() * Double.valueOf(price).hashCode() * quantity;
    }
}
