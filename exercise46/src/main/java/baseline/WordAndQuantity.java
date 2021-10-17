package baseline;

import org.jetbrains.annotations.NotNull;

public class WordAndQuantity implements Comparable<WordAndQuantity>{
    private int quantity = 1;
    private final String word;

    public WordAndQuantity(String wordIn) {
        //Simply set word to wordIn.
        this.word = wordIn;
    }

    public void incrementQuantity() {
        //Simply increment the quantity by 1.
        quantity++;
    }

    //Need to implement compareTo, equals, and hashCode for proper sorting.
    public int compareTo(@NotNull WordAndQuantity otherWordAndQuantity) {
        //First, compare the quantities. If they aren't different, compare the words.
        return 0;
    }

    public boolean equals(Object otherWordAndQuantity) {
        //If the object isn't of type WordAndQuantity, return false.
        //Otherwise, return compareTo((WordAndQuantity) otherWordAndQuantity) == 0.
        return false;
    }

    public int hashCode() {
        //Simply return the hashcode of word * quantity.
        return 0;
    }
}
