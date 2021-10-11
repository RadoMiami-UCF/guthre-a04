/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.ArrayList;
import java.util.Collections;

public class Solution41 {
    private final ArrayList<String> listOfNames = new ArrayList<>();
    private final FileReaderForNames fileReader = new FileReaderForNames(listOfNames);
    private final FileWriterForNames fileWriter = new FileWriterForNames(listOfNames);
    public static void main(String[] args) {
        //First, create an instance of Solution41.
        var app = new Solution41();
        //Then, read a list of names using fileReader.readNames(), storing them to listOfNames.
        app.fileReader.readFromFile();
        //Then, use Collections.sort() to sort the names in listOfNames.
        Collections.sort(app.listOfNames);
        //Finally, use fileWriter.writeNames() store the names to the file.
        app.fileWriter.writeToFile();
    }
}
