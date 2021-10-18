/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class WordFileReader {
    private static final Pattern VALID_DELIMITERS = Pattern.compile("[ \r\n\".,:;!?]+");
    private final List<WordAndQuantity> wordListToWriteTo;
    private final Path pathToReadFrom;

    public WordFileReader(List<WordAndQuantity> wordListToWriteToIn, Path pathToReadFromIn) {
        this.wordListToWriteTo = wordListToWriteToIn;
        this.pathToReadFrom = pathToReadFromIn;
    }

    public void fillWordList() {
        //First, write the file at pathToReadFrom to a string.
        var wordListString = "";
        try {
            wordListString = Files.readString(this.pathToReadFrom);
        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen I/O error! Perhaps an illegal file name was given?", exception);
        }
        /*Then, go through every word in the string. (A word here is defined as anything surrounded by spaces,
        quotation marks, line breaks, or beginning/end of files).*/
        for(String wordString : (VALID_DELIMITERS.split(wordListString))) {
            if(!VALID_DELIMITERS.matcher(wordString).matches()) {
                addOrIncrementWord(wordString);
            }
        }
    }

    private void addOrIncrementWord(String wordString) {
        for(WordAndQuantity word : wordListToWriteTo) {
            //If the word has been seen before, increment its counter by 1.
            if(wordString.equalsIgnoreCase(word.word())) {
                word.incrementQuantity();
                return;
            }
        }
        //If the word hasn't been seen before, add it to wordListToWriteTo.
        wordListToWriteTo.add(new WordAndQuantity(wordString.toLowerCase(Locale.US)));
    }
}
