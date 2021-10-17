package baseline;

import java.nio.file.Path;

public class WordReplacer {
    private static final String WORD_TO_REPLACE = "utilize";
    private static final String WORD_TO_REPLACE_WITH = "use";
    private final String stringToModify;

    public WordReplacer(Path stringToModifyIn) {
        //Set stringToModify to a string generated from the file at stringToModifyIn.
        this.stringToModify = "";
    }

    public String replaceWordsInString() {
        //Use stringToModify.replaceAll() to replace all the instances of WORD_TO_REPLACE with WORD_TO_REPLACE_WITH.
        //Then, return the given string.
        return "";
    }
}
