package baseline;

import java.util.List;

final class OutputToFile extends FileAccessor {
    private static final String DEFAULT_OUTPUT_PATH = "data/exercise42_output.txt";
    public OutputToFile(String pathToFileIn, List<EmployeeData> dataArrayIn) {
        //When created, simply pass in the arguments to the superclass' constructor.
        super(dataArrayIn, pathToFileIn);
    }

    public OutputToFile(List<EmployeeData> dataArrayIn) {
        //If an output path isn't given, then simply output to the default output path.
        super(dataArrayIn, DEFAULT_OUTPUT_PATH);
    }

    public void writeData() {
        //First, write the header of the table (that being the words "Last", "First", "Salary", and the correct number
        //of spaces and hyphens).
        //Calculate the correct number of spaces and hyphens from the lengths of the longest first name, last name, and
        //salary.
        //Then, write each of the employees' data to the table (their first names, last names, and their salaries).
        //Get this information from dataArray.
    }
}
