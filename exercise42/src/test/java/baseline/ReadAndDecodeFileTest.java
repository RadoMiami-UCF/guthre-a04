package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadAndDecodeFileTest {

    @Test
    void testReadData() {
        ArrayList<EmployeeData> testEmployeeArray = new ArrayList<>();
        var testReadAndDecodeFile = new ReadAndDecodeFile(testEmployeeArray,
                "data/exercise42_test_input.txt");
        testReadAndDecodeFile.readData();
        assertEquals(List.of(new EmployeeData("Bob", "Chris", 12),
                new EmployeeData("Tim", "White", 3)), testEmployeeArray,
                "testEmployeeArray not properly updated to file's contents!");
    }
    /* This test was commented out because it refers to a now private method. Make the method public to use the test!
    @Test
    void testDecodeData() {
        assertEquals(new EmployeeData("Bob", "Chris", 12),
                ReadAndDecodeFile.decodeData("Bob,Chris,12"),
                "Returned EmployeeData does not match expectations #1");
        assertEquals(new EmployeeData("Steve", "Minecraft", 27.95),
                ReadAndDecodeFile.decodeData("Steve,Minecraft,27.95"),
                "Returned EmployeeData does not match expectations #2");
        assertEquals(new EmployeeData("SomeoneWith", "AReasonableSalary", 70000),
                ReadAndDecodeFile.decodeData("SomeoneWith,AReasonableSalary,70000"),
                "Returned EmployeeData does not match expectations #3");
    }*/
}