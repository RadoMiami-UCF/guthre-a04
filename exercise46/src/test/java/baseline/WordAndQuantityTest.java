/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAndQuantityTest {

    @Test
    void testCompareTo() {
        assertTrue(new WordAndQuantity("lemons", 3).compareTo
                        (new WordAndQuantity("lemonade", 1)) < 0,
                "Comparison does not work properly with quantities!");
        assertFalse(new WordAndQuantity("a", 1).compareTo
                        (new WordAndQuantity("z", 1)) > 0,
                "Comparison does not work properly with words!");
        assertEquals(0, new WordAndQuantity("lemons", 3).compareTo
                (new WordAndQuantity("lemons", 3)),
                "Comparison does not work properly in the event that both WordAndQuantities are equal!");
    }
}