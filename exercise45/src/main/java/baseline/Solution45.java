/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution45 {
    //This doesn't use any instance variables because FileWriter relies on a variable that isn't known from the start.
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final Path PATH_TO_READ_FROM = Path.of("data/exercise45_input.txt");
    private static final String ROOT_PATH_TO_WRITE_TO = "data/";

    public static void main(String[] args) {
        //First, read the file at PATH_TO_READ_FROM, getting the string representation of it.
        //Then, pass the string into a WordReplacer called wordReplacer.
        var wordReplacer = new WordReplacer(PATH_TO_READ_FROM);
        //Then, use wordReplacer to get a string with all the instances of the word "utilize" changed to the word "use".
        var modifiedString = wordReplacer.replaceWordsInString();
        /*Then, create a FileWriter named fileWriter based on a filename given from the user through safeGetPath and
        the string from wordReplacer.*/
        //Then, prompt the user for a filename.
        System.out.print("What should the name of the output file be? ");
        var fileWriter = new FileWriter(modifiedString, safeGetPath(in.nextLine()));
        //Finally, use fileWriter to write the file to a given file name.
        fileWriter.writeFile();
    }

    private static Path safeGetPath(String userString) {
        //First, check to see if there's a file extension on the string.
        if(!Pattern.matches(".*\\.([\\p{IsAlphabetic}\\d]+)", userString)) {
            //If there isn't, add .txt to the end.
            userString += ".txt";
        }
        //Then, use getFileName() to trim off any potential paths added to the left.
        //Finally, return that string as a path and add data/ to the beginning of the path.
        return Path.of(ROOT_PATH_TO_WRITE_TO + (Path.of(userString)).getFileName());
    }
}
