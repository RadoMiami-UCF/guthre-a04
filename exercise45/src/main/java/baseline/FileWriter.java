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

public class FileWriter {
    private final Path pathToWriteTo;
    private final String stringToWrite;

    public FileWriter(String stringToWriteIn, Path pathToFileIn) {
        this.stringToWrite = stringToWriteIn;
        this.pathToWriteTo = pathToFileIn;
    }

    public void writeFile() {
        //Write stringToWrite to the file at pathToWriteTo through Files.newBufferedWriter().
        try(var output = Files.newBufferedWriter(this.pathToWriteTo)) {
            output.write(stringToWrite);

        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen I/O error! Perhaps an illegal file name was given?", exception);
        }
    }
}
