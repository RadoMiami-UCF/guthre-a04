/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

final class ReadAndDecodeFile extends FileAccessor {
    private static final int INDEX_OF_SALARY_IN_ARRAY = 2;
    private static final String DEFAULT_INPUT_PATH = "data/exercise42_input.txt";

    public ReadAndDecodeFile(List<EmployeeData> dataArrayIn, String pathAsString) {
        //Simply pass in the data array received and the path as a string into the superclass' constructor.
        super(dataArrayIn, pathAsString);
    }

    public ReadAndDecodeFile(List<EmployeeData> dataArrayIn) {
        //If an input path isn't given, then simply output to the default output path.
        super(dataArrayIn, DEFAULT_INPUT_PATH);
    }

    public void readData() {
        try (var input = Files.newBufferedReader(this.pathToFile)){
            var thisLine = "Filler";
            //Start a loop.
            while(thisLine != null) {
                //First, grab the next line from the input file.
                thisLine = input.readLine();
                /*Then, check if it is in the format of (alphabetic characters),(alphabetic characters),(double).
                If it is, then add the output of ReadAndDecodeFile.decodeData() to dataArray.*/
                if(thisLine != null &&
                        Pattern.matches("[\\p{IsAlphabetic}]+,[\\p{IsAlphabetic}]+,([\\d]+\\.[\\d]+|[\\d]+)",
                        thisLine)) {
                    //Read the line, then put it in the arrayList, and then move on to the next line.
                    this.dataArray.add(decodeData(thisLine));
                }
                /*If it isn't in the format, and is rather empty, then the loop ends, as the file has ended.
                If it isn't in the format and isn't empty, then the line is simply ignored.*/
            }
            //Finally, after everything is read, have the try with resources close the file.

        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen case of file not being able to be opened!", exception);
        }
    }

    private static EmployeeData decodeData(String dataString) {
        //First, take in a known good string an argument.
        //Then, use the commas to split it into three pieces.
        String[] splitString = dataString.split(",");
        //Finally, return an EmployeeData object with the firstName, lastName, and salary of the EmployeeData object to
        //their respective values.
        return new EmployeeData(splitString[0], splitString[1],
                Double.parseDouble(splitString[INDEX_OF_SALARY_IN_ARRAY]));
    }
}
