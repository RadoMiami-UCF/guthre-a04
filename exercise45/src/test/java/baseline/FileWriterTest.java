/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {

    @Test
    void testWriteFile() throws IOException {
        var fileWriter = new FileWriter("Upper line\nLower line",
                Path.of("data/testcases/exercise45_output_test.txt"));
        fileWriter.writeFile();
        assertLinesMatch(List.of("Upper line", "Lower line"),
                Files.readAllLines(Path.of("data/testcases/exercise45_output_test.txt")),
                "File does not match what was expected!");
    }
}