package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class FileAccessor {
    //Have two variables: a path to the file named pathToFile and an ArrayList<EmployeeData> named dataArray.
    protected Path pathToFile;
    protected List<EmployeeData> dataArray;
    //Maybe I can just get away with copying and pasting my old implementation for this?
    protected FileAccessor(List<EmployeeData> dataArrayIn, String pathToFileIn) {
        //Set arrayListToAccess to inArrayList.
        dataArray = dataArrayIn;
        //Then, try to create the file at pathToAccessIn to make sure that it actually exists. If it doesn't exist, then
        //create it.
        if (!Files.exists(Path.of(pathToFileIn))) {
            try {
                Files.createFile(Path.of(pathToFileIn));
            } catch (IOException exception) {
                var logger = Logger.getLogger("IOExceptionLogger");
                logger.log(Level.SEVERE, "Unforeseen I/O error!", exception);
            }
        }

        pathToFile = Path.of(pathToFileIn);
    }
}
