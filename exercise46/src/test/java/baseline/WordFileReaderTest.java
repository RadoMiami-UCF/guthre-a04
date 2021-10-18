/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordFileReaderTest {

    @Test
    void testFillWordList() {
        ArrayList<WordAndQuantity> wordArray = new ArrayList<>();
        var testReader = new WordFileReader(wordArray, Path.of("data/unittests/exercise46_input_test.txt"));
        testReader.fillWordList();
        assertArrayEquals(new WordAndQuantity[]{new WordAndQuantity("yellow", 5),
        new WordAndQuantity("black", 5), new WordAndQuantity("ooh", 1),
        new WordAndQuantity("and", 1), new WordAndQuantity("let's", 1),
        new WordAndQuantity("shake", 1), new WordAndQuantity("it", 1),
        new WordAndQuantity("up", 1), new WordAndQuantity("a", 1),
        new WordAndQuantity("little", 1)}, wordArray.toArray(),
                "wordArray.toArray() does not match what was expected!");

    }
}