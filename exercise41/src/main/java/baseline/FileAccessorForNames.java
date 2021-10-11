/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

class FileAccessorForNames {
    protected List<String> arrayListToAccess;

    protected Path pathToAccess;

    protected FileAccessorForNames(List<String> inArrayList, Path pathToAccessIn) {
        //Set arrayListToAccess to inArrayList.
        arrayListToAccess = inArrayList;
        //Then, try to create the file at pathToAccessIn to make sure that it actually exists. If it doesn't exist, then
        //create it.
        if (!Files.exists(pathToAccessIn)) {
            try {
                Files.createFile(pathToAccessIn);
            } catch (IOException exception) {
                var logger = Logger.getLogger("IOExceptionLogger");
                logger.log(Level.SEVERE, "Unforeseen I/O error!", exception);
            }
        }

        pathToAccess = pathToAccessIn;
    }
}
