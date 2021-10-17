/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ProductSearcher {
    private static final DecimalFormat priceFormat = new DecimalFormat("$0.00");
    private final List<Product> productList;

    public ProductSearcher(List<Product> productListIn) {
        //Simply set productList to productListIn.
        this.productList = new ArrayList<>(productListIn);
    }

    public boolean searchProducts(String searchString) {
        //For each product in the list, compare searchString to the name.
        for(Product product : productList) {
            //If they match (case-insensitive), then say the data of the product. and return true.
            if(searchString.equalsIgnoreCase(product.name())) {
                System.out.println("Name: " + product.name() + "\nPrice: " + priceFormat.format(product.price())
                        + "\nQuantity: " + product.quantity());
                return true;
            }
            //If they don't, move on to the next product.
        }
        //If there was no match in the entire list, say that the product was not found and return false.
        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }
}
