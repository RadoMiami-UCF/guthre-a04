package baseline;

import java.util.List;

public class CreateHistogram {
    private final List<WordAndQuantity> wordListToReadFrom;

    public CreateHistogram(List<WordAndQuantity> wordListToReadFromIn) {
        this.wordListToReadFrom = wordListToReadFromIn;
    }

    public void createHistogram() {
        //First, sort wordListToReadFrom.
        //Then, for each entry, list the word, then a number of *s equal to the word's quantity.
    }
}
