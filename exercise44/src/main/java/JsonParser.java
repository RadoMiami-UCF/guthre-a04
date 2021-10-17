import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {
    private final ProductList products;
    private Path pathToJson;

    public JsonParser(List<Product> productListIn, Path pathToJsonIn) {
        //Set each value to their respective parameters.
        this.products = new ProductList(productListIn);
        this.pathToJson = pathToJsonIn;
    }

    public List<Product> readJson() {
        //First, turn the file at pathToJson into a string.
        //Then, do fromJson([the string], ProductList.class).
        //Finally, return the products.getList().
        return new ArrayList<>();
    }
}
