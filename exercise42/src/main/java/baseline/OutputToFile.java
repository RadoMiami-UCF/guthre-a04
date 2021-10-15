package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class OutputToFile extends FileAccessor {
    private static final int FORMATTING_SPACES_REQUIRED = 2;
    private static final int LAST_NAME_MINIMUM_LENGTH = 4;
    private static final int FIRST_NAME_MINIMUM_LENGTH = 5;
    private static final int SALARY_MINIMUM_LENGTH = 6;
    private static final String DEFAULT_OUTPUT_PATH = "data/exercise42_output.txt";
    private static final DecimalFormat salaryFormat = new DecimalFormat("$0.00");

    public OutputToFile(List<EmployeeData> dataArrayIn, String pathAsString) {
        //Simply pass in the data array received and the path as a string into the superclass' constructor.
        super(dataArrayIn, pathAsString);
    }

    public OutputToFile(List<EmployeeData> dataArrayIn) {
        //If an output path isn't given, then simply output to the default output path.
        super(dataArrayIn, DEFAULT_OUTPUT_PATH);
    }

    public void writeData() {
        //First, find the lengths of the longest last name, first name, and salary.
        var lengthOfLongestFirstName = 0;
        var lengthOfLongestLastName = 0;
        var lengthOfLongestSalary = 0;
        try {
            lengthOfLongestFirstName = dataArray.get(0).firstName().length();
            lengthOfLongestLastName = dataArray.get(0).lastName().length();
            lengthOfLongestSalary = salaryFormat.format(dataArray.get(0).salary()).length();
        } catch (IndexOutOfBoundsException exception) {
            var logger = Logger.getLogger("IndexOutOfBoundsExceptionLogger");
            logger.log(Level.SEVERE, "Input file (data/exercise42_input.txt) did not exist/was empty!", exception);
        }

        for(EmployeeData dataArrayEntry : dataArray) {
            if(dataArrayEntry.firstName().length() + FORMATTING_SPACES_REQUIRED > lengthOfLongestFirstName) {
                lengthOfLongestFirstName = dataArrayEntry.firstName().length() + FORMATTING_SPACES_REQUIRED;
            }
            if(dataArrayEntry.lastName().length() + FORMATTING_SPACES_REQUIRED > lengthOfLongestLastName) {
                lengthOfLongestLastName = dataArrayEntry.lastName().length() + FORMATTING_SPACES_REQUIRED;
            }
            if(salaryFormat.format(dataArrayEntry.salary()).length() > lengthOfLongestSalary) {
                lengthOfLongestSalary = salaryFormat.format(dataArrayEntry.salary()).length();
            }
        }
        //Then, if any of them are below a required length, make them the required length.
        if(lengthOfLongestFirstName < FIRST_NAME_MINIMUM_LENGTH + FORMATTING_SPACES_REQUIRED) {
            lengthOfLongestFirstName = FIRST_NAME_MINIMUM_LENGTH + FORMATTING_SPACES_REQUIRED;
        }

        if(lengthOfLongestLastName < LAST_NAME_MINIMUM_LENGTH + FORMATTING_SPACES_REQUIRED) {
            lengthOfLongestLastName = LAST_NAME_MINIMUM_LENGTH + FORMATTING_SPACES_REQUIRED;
        }

        if(lengthOfLongestSalary < SALARY_MINIMUM_LENGTH) {
            lengthOfLongestSalary = SALARY_MINIMUM_LENGTH;
        }
        try(var output = Files.newBufferedWriter(this.pathToFile)) {
            /*Then, write the header of the table (that being the words "Last", "First", "Salary", and the correct
            number of spaces and hyphens). Calculate the correct number of spaces and hyphens from the lengths of the
            longest first name, last name, and salary.*/
            output.write("Last" + " ".repeat(lengthOfLongestLastName - LAST_NAME_MINIMUM_LENGTH) + "First" +
                    " ".repeat(lengthOfLongestFirstName - FIRST_NAME_MINIMUM_LENGTH) + "Salary\n");
            output.write("-".repeat(lengthOfLongestFirstName + lengthOfLongestLastName + lengthOfLongestSalary)
                    + "\n");
            /*Then, write each of the employees' data to the table (their first names, last names, and their salaries).
            Get this information from dataArray.*/
            for(EmployeeData dataArrayEntry : dataArray) {
                output.write(dataArrayEntry.lastName()
                        + " ".repeat(lengthOfLongestLastName - dataArrayEntry.lastName().length())
                        + dataArrayEntry.firstName() +
                        " ".repeat(lengthOfLongestFirstName - dataArrayEntry.firstName().length())
                        + salaryFormat.format(dataArrayEntry.salary()) + "\n");
            }
        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen case of file not being able to be opened!", exception);
        }
    }
}
