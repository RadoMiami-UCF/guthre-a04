package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearcherTest {

    @Test
    void testSearchProducts() {
        var testSearcher = new ProductSearcher(List.of(new Product("Pack of 30 cookies", 12.99, 1),
                new Product("Lemon", 0.99, 12)));
        assertTrue(testSearcher.searchProducts("Lemon"), "Returns false even if match is found #1!");
        assertTrue(testSearcher.searchProducts("Pack of 30 cookies"),
                "Returns false even if match is found #2!");
        assertFalse(testSearcher.searchProducts("Potato"),
                "Returns true even if match is not found!");
    }
}