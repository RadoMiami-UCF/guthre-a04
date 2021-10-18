/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.List;

public class CreateHistogram {
    private static final int BUFFER_SPACES = 1;
    private final List<WordAndQuantity> wordListToReadFrom;

    public CreateHistogram(List<WordAndQuantity> wordListToReadFromIn) {
        this.wordListToReadFrom = wordListToReadFromIn;
    }

    public void createHistogram() {
        //First, sort wordListToReadFrom.
        this.wordListToReadFrom.sort(new WordAndQuantityComparator());
        //Then, find the longest word of the list and store it in a variable.
        var longestWordLength = 0;
        for(WordAndQuantity word : this.wordListToReadFrom) {
            if(longestWordLength < word.word().length()) {
                longestWordLength = word.word().length();
            }
        }
        //Then, for each entry, list the word, then a number of *s equal to the word's quantity.
        //Unfortunately, this for loop can't be merged with the one on line 18.
        for(WordAndQuantity word : this.wordListToReadFrom) {
            System.out.println(word.word() + ":"
                    + " ".repeat((longestWordLength + BUFFER_SPACES) - word.word().length())
                    + "*".repeat(word.quantity()));
        }
    }
}
