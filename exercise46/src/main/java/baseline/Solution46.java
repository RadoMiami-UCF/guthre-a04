/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.file.Path;
import java.util.ArrayList;

public class Solution46 {
    private static final Path INPUT_FILE_PATH = Path.of("data/exercise46_input.txt");
    private ArrayList<WordAndQuantity> wordArray = new ArrayList<>();
    private final WordFileReader fileReader = new WordFileReader(this.wordArray, INPUT_FILE_PATH);

    public static void main(String[] args) {
        //First, create an instance of Solution46 named app.
        var app = new Solution46();
        //Then, use app.fileReader.fillWordList() to fill wordArray with the words and their quantities.
        app.wordArray = (ArrayList<WordAndQuantity>) app.fileReader.fillWordList();
        /*Finally, use app.histogramCreator.createHistogram() to print a histogram containing the words and their
        quantities to the screen.*/
        var histogramCreator = new CreateHistogram(app.wordArray);
        histogramCreator.createHistogram();
    }
}
