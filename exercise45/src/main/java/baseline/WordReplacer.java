/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WordReplacer {
    private static final String WORD_TO_REPLACE = "utilize";
    private static final String WORD_TO_REPLACE_WITH = "use";
    private String stringToModify = "";

    public WordReplacer(Path fileToRead) {
        //Set stringToModify to a string generated from the file at stringToModifyIn.
        try {
            this.stringToModify = Files.readString(fileToRead);
        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen I/O error!", exception);
        }
    }

    public String replaceWordsInString() {
        //Use stringToModify.replaceAll() to replace all the instances of WORD_TO_REPLACE with WORD_TO_REPLACE_WITH.
        //Then, return the given string.
        /*Apparently, you don't need to account for words trapped within delimiters! There used to be some code for
        this, but it got removed and replaced with in my opinion, much inferior code.*/
        return stringToModify.replace(WORD_TO_REPLACE, WORD_TO_REPLACE_WITH);
    }
}
