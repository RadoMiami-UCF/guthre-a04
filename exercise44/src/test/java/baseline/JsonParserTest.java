package baseline;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JsonParserTest {

    @Test
    void testReadJson() {
        var testParser = new JsonParser(Path.of("data/exercise44_input_test.json"));
        ArrayList<Product> productList = (ArrayList<Product>) testParser.readJson();
        assertEquals(new ArrayList<>(List.of(new Product("Apple", 0.99, 10),
                new Product("Banana", 0.99, 10),
                new Product("Orange", 0.99, 5),
                new Product("Watermelon", 3.49, 2))), productList,
                "readJson is not returning what is expected!");
    }
}