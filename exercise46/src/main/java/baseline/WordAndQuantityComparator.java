/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.Serial;
import java.io.Serializable;
import java.util.Comparator;

public class WordAndQuantityComparator implements Comparator<WordAndQuantity>, Serializable {
    //Apparently, adding a random serialVersionUID is the lesser of two evils.
    @Serial
    private static final long serialVersionUID = 1;

    @Override
    public int compare(WordAndQuantity o1, WordAndQuantity o2) {
        return o1.compareTo(o2);
    }
}
