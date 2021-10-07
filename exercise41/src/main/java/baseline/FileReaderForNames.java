/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.File;
import java.util.List;

final class FileReaderForNames extends AbstractFileAccessorForNames {
    //Don't worry SonarLint, the end user need not change the file. Even if they do, they can change it here.
    private static final String FILE_TO_READ_FROM_PATH = "file:///$PROJECT_DIR$/data/exercise41_input.txt";

    public FileReaderForNames(List<String> inArrayList) {
        super(inArrayList, new File(FILE_TO_READ_FROM_PATH));
        //Set fileToAccess to $PROJECT_DIR$/data/exercise41_input.txt, and pass inArrayList to the superclass'
        //constructor.
    }

    public void readFromFile() {
        //Until the end of file is reached...
        //Read each line (punctuated by a linebreak), then put it in the arrayList.
    }
}
