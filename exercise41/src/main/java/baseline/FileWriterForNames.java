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

final class FileWriterForNames extends FileAccessorForNames {
    private static final String DEFAULT_OUTPUT_PATH = "data/exercise41_output.txt";

    public FileWriterForNames(List<String> inArrayList) {
        //Set pathToAccess to the default, and pass inArrayList to the superclass' constructor.
        super(inArrayList, Paths.get(DEFAULT_OUTPUT_PATH));
    }

    public FileWriterForNames(List<String> inArrayList, String pathToFile) {
        //Set pathToAccess to pathToFile, and pass inArrayList to the superclass' constructor.
        super(inArrayList, Paths.get(pathToFile));
    }

    public void writeToFile() {
        try (var output = Files.newBufferedWriter(this.pathToAccess)){
            //First, write the total number of names in the list.
            output.write("Total of " + arrayListToAccess.size() + " names\n-----------------");
            //Then, start a loop:
            for(String nameString : arrayListToAccess) {
                //For every string in the sorted arraylist, write the name, then a line break.
                output.write("\n" + nameString);
            }
            //Finally, after everything is written, have the try with resources close the file.

        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen case of file not being able to be opened!", exception);
        }
    }
}
