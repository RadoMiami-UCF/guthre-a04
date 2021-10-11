package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static org.junit.jupiter.api.Assertions.*;

class FileWriterForNamesTest {

    @Test
    void testWriteToFile() throws IOException {
        //This test writes to data/exercise41_output_test.txt because it's a directory that always should work.
        var testWriter = new FileWriterForNames(List.of("Andrew", "Bob", "Chris"),
                "data/exercise41_output_test.txt");
        testWriter.writeToFile();
        assertLinesMatch(List.of("Total of 3 names", "-----------------", "Andrew", "Bob", "Chris"),
                readAllLines(Path.of("data/exercise41_output_test.txt")),
                "File written does not match list!");
    }
}