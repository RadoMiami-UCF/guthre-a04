package baseline;

import java.nio.file.Path;

public class FileWriter {
    private final Path pathToWriteTo;
    private final String stringToWrite;

    public FileWriter(String stringToWriteIn, Path pathToFileIn) {
        this.stringToWrite = stringToWriteIn;
        this.pathToWriteTo = pathToFileIn;
    }

    public void writeFile() {
        //Write stringToWrite to the file at pathToWriteTo through Files.newBufferedWriter().
    }
}
