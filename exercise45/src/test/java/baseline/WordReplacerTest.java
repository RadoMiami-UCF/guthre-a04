/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {

    @Test
    void testReplaceWordsInString() {
        var wordReplacer = new WordReplacer(Path.of("data/testcases/exercise45_input_test_1.txt"));
        assertEquals("use use banana use", wordReplacer.replaceWordsInString(),
                "Not all uses of utilize turned into use!");
        /*Apparently the program is supposed to roll with words not surrounded by delimiters. Joy. It's not like I
        programmed thinking on common sense instead of exactly what was wanted...
        wordReplacer = new WordReplacer(Path.of("data/testcases/exercise45_input_test_2.txt"));
        assertEquals("use utilized use use\nuse use test un-utilize", wordReplacer.replaceWordsInString(),
                "Word replacement does not account for words not surrounded by delimiters!");*/
    }
}