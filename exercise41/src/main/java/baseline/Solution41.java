/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.ArrayList;

public class Solution41 {
    private ArrayList<String> listOfNames = new ArrayList<>();
    private FileReaderForNames fileReader = new FileReaderForNames(listOfNames);
    private NameSorter nameSorter = new NameSorter(listOfNames);
    private FileWriterForNames fileWriter = new FileWriterForNames(listOfNames);
    public static void main(String[] args) {
        //First, create an instance of Solution41.
        //Then, read a list of names using fileReader.readNames(), storing them to listOfNames.
        //Then, use nameSorter.sortNames() to sort the names in listOfNames.
        //Finally, use fileWriter.writeNames() store the names to the file.
    }
}
