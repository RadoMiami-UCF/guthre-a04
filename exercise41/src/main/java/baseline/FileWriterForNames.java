/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.File;
import java.util.List;

final class FileWriterForNames extends AbstractFileAccessorForNames {
    //Don't worry SonarLint, the end user need not change the file. Even if they do, they can change it here.
    private static final String FILE_TO_WRITE_TO_PATH = "file:///$PROJECT_DIR$/data/exercise41_output.txt";

    public FileWriterForNames(List<String> inArrayList) {
        super(inArrayList, new File(FILE_TO_WRITE_TO_PATH));
        //Set fileToAccess to $PROJECT_DIR$/data/exercise41_output.txt, and pass inArrayList to the superclass'
        //constructor.
    }

    public void writeToFile() {
        //First, write the total number of names in the list.
        //Then, start a loop:
        //For every string in the sorted arraylist, write the name, then a line break.
    }
}
