package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderForNamesTest {

    @Test
    void testReadFromFile() {
        ArrayList<String> writeToArrayList = new ArrayList<>();
        var testReader = new FileReaderForNames(writeToArrayList, "data/exercise41_input_test.txt");
        testReader.readFromFile();
        assertEquals(List.of("Chunk", "Gronk", "Bob"), writeToArrayList,
                "List not equal to what should be in file!");
    }
}