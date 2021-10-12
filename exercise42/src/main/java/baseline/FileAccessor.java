package baseline;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class FileAccessor {
    //Have two variables: a path to the file named pathToFile and an ArrayList<EmployeeData> named dataArray.
    protected Path pathToFile;
    protected ArrayList<EmployeeData> dataArray;
    //Maybe I can just get away with copying and pasting my old implementation for this?
    protected FileAccessor(List<EmployeeData> dataArrayIn, String pathToFileIn) {
        //First, set dataArray to dataArrayIn.
        //Then, if the file at pathToFileIn doesn't exist, then create it.
    }
}
