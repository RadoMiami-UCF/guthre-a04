package baseline;

import java.nio.file.Path;

public class Solution45 {
    /*This doesn't use any instance variables because FileWriter the classes relies on a variable that isn't known from
    the start.*/
    private static final Path PATH_TO_READ_FROM = Path.of("data/exercise45_input.txt");

    public static void main(String[] args) {
        //First, read the file at PATH_TO_READ_FROM, getting the string representation of it.
        //Then, pass the string into a WordReplacer called wordReplacer.
        //Then, use wordReplacer to get a string with all the instances of the word "utilize" changed to the word "use".
        /*Then, create a FileWriter named fileWriter based on a path given from the user through in.nextLine() and the
        string from wordReplacer.*/
        //Finally, use fileWriter to write the file to a given file name.
    }
}
