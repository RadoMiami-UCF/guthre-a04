package baseline;

import java.util.List;

final class TakeInputFromFile extends FileAccessor {
    private static final String DEFAULT_INPUT_PATH = "data/exercise42_input.txt";
    public TakeInputFromFile(String pathToFileIn, List<EmployeeData> dataArrayIn) {
        //When created, simply pass in the arguments to the superclass' constructor.
        super(dataArrayIn, pathToFileIn);
    }

    public TakeInputFromFile(List<EmployeeData> dataArrayIn) {
        //If an input path isn't given, then simply output to the default output path.
        super(dataArrayIn, DEFAULT_INPUT_PATH);
    }

    public void readData() {
        //First, read a line from the file.
        //Then, check if it is in the format of (alphabetic characters),(alphabetic characters),(numerical characters).
        //If it is, then add the output of DecodeEmployeeData.decode() to dataArray.
        //If it isn't, then ignore that line.
        //Rinse and repeat until you reach the end of file.
    }
}
