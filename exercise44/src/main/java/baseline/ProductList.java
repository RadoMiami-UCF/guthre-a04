/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    //A wrapper object for lists of products so that gson works properly.
    private final List<Product> products;

    public ProductList(List<Product> inProductList) {
        //Simply set products to inProductList.
        this.products = new ArrayList<>(inProductList);
    }

    public List<Product> getList() {
        //Get method for the arrayList.
        return new ArrayList<>(products);
    }
}
