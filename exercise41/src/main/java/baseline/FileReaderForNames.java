/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class FileReaderForNames extends FileAccessorForNames {
    private static final String DEFAULT_INPUT_PATH = "data/exercise41_input.txt";

    public FileReaderForNames(List<String> inArrayList) {
        //Set pathToAccess to DEFAULT_INPUT_PATH, and pass inArrayList to the superclass' constructor.
        super(inArrayList, Paths.get(DEFAULT_INPUT_PATH));
    }

    public FileReaderForNames(List<String> inArrayList, String pathToFile) {
        //Set pathToAccess to pathToFile, and pass inArrayList to the superclass' constructor.
        super(inArrayList, Paths.get(pathToFile));
    }

    public void readFromFile() {
        try (var input = Files.newBufferedReader(this.pathToAccess)){
            var thisLine = "";
            //Start a loop.
            while(true) {
                //While it's not the end of file,
                thisLine = input.readLine();
                if(thisLine != null) {
                    //Read the line, then put it in the arrayList, and then move on to the next line.
                    this.arrayListToAccess.add(thisLine);
                } else {
                    break;
                }
            }
            //Finally, after everything is read, have the try with resources close the file.

        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen case of file not being able to be opened!", exception);
        }
    }
}
