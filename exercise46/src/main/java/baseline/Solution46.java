package baseline;

import java.nio.file.Path;
import java.util.ArrayList;

public class Solution46 {
    private static final Path INPUT_FILE_PATH = Path.of("data/exercise46_input.txt");
    private ArrayList<WordAndQuantity> wordArray = new ArrayList<>();
    private WordFileReader fileReader = new WordFileReader(this.wordArray, INPUT_FILE_PATH);
    private CreateHistogram histogramCreator = new CreateHistogram(this.wordArray);

    public static void main(String[] args) {
        //First, create an instance of Solution46 named app.
        //Then, use app.fileReader.fillWordList() to fill wordArray with the words and their quantities.
        /*Finally, use histogramCreator.createHistogram() to print a histogram containing the words and their quantities
        to the screen.*/
    }
}
