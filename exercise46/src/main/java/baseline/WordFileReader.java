package baseline;

import java.nio.file.Path;
import java.util.List;

public class WordFileReader {
    private final List<WordAndQuantity> wordListToWriteTo;
    private final Path pathToReadFrom;

    public WordFileReader(List<WordAndQuantity> wordListToWriteToIn, Path pathToReadFromIn) {
        this.wordListToWriteTo = wordListToWriteToIn;
        this.pathToReadFrom = pathToReadFromIn;
    }

    public void fillWordList() {
        /*Go through every word in the file. (A word here is defined as anything surrounded by spaces, quotation marks,
        line breaks, or beginning/end of files).*/
        //If the word hasn't been seen before, add it to wordListToWriteTo.
        //If the word has been seen before, increment its counter by 1.
    }
}
