/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.jetbrains.annotations.NotNull;

public class WordAndQuantity implements Comparable<WordAndQuantity>{
    private int quantity = 1;
    private final String word;

    public WordAndQuantity(String wordIn) {
        //Simply set word to wordIn.
        this.word = wordIn;
    }

    public WordAndQuantity(String wordIn, int quantityIn) {
        this.word = wordIn;
        this.quantity = quantityIn;
    }

    public void incrementQuantity() {
        //Simply increment the quantity by 1.
        this.quantity++;
    }

    public String word() {
        return word;
    }

    public int quantity() {
        return this.quantity;
    }

    //Need to implement compareTo, equals, and hashCode for proper sorting.
    public int compareTo(@NotNull WordAndQuantity otherWordAndQuantity) {
        //First, compare the quantities. If they aren't different, compare the words.
        if(this.quantity == otherWordAndQuantity.quantity) {
            return this.word.compareTo(otherWordAndQuantity.word);
        } else {
            return otherWordAndQuantity.quantity - this.quantity;
        }
    }

    public boolean equals(Object otherWordAndQuantity) {
        //If the object isn't of type WordAndQuantity, return false.
        if(otherWordAndQuantity != null && otherWordAndQuantity.getClass() == this.getClass()) {
            //Otherwise, return compareTo((WordAndQuantity) otherWordAndQuantity) == 0.
            return this.compareTo((WordAndQuantity) otherWordAndQuantity) == 0;
        } else {
            return false;
        }
    }

    public int hashCode() {
        //Simply return the hashcode of word * quantity.
        return word.hashCode() * this.quantity;
    }
}
