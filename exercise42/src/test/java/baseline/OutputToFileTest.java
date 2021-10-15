/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static org.junit.jupiter.api.Assertions.*;

class OutputToFileTest {

    @Test
    void testWriteData() throws IOException {
        var testWriter = new OutputToFile(List.of(new EmployeeData("Bob", "Chris", 12),
                new EmployeeData("Chris", "White", 3)),
                "data/exercise42_output_test.txt");
        testWriter.writeData();
        assertLinesMatch(List.of("Last   First  Salary", "--------------------",
                        "Bob    Chris  $12.00", "Chris  White  $3.00"),
                readAllLines(Path.of("data/exercise42_output_test.txt")),
                "File written does not match list!");
    }

    @Test
    void testWriteDataWithSmallNames() throws IOException {
        var testWriter = new OutputToFile(List.of(new EmployeeData("A", "B", 18.42),
                new EmployeeData("See", "Dee", 12.34)),
                "data/exercise42_output_test.txt");
        testWriter.writeData();
        assertLinesMatch(List.of("Last  First  Salary", "-------------------", "A     B      $18.42",
                "See   Dee    $12.34"), readAllLines(Path.of("data/exercise42_output_test.txt")),
                "File written does not match list with small names!");
    }

    @Test
    void testWriteDataWithLargeSalaries() throws IOException {
        var testWriter = new OutputToFile(List.of(new EmployeeData("Bob", "Bob", 123456789.10),
                new EmployeeData("SomeoneWith", "AReasonableSalary", 75000)),
                "data/exercise42_output_test.txt");
        testWriter.writeData();
        assertLinesMatch(List.of("Last         First              Salary",
                "---------------------------------------------", "Bob          Bob                $123456789.10",
                "SomeoneWith  AReasonableSalary  $75000.00"),
                readAllLines(Path.of("data/exercise42_output_test.txt")),
                "File written does not match list with long salaries!");
    }
}