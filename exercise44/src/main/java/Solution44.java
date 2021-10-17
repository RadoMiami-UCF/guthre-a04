import java.nio.file.Paths;
import java.util.ArrayList;

public class Solution44 {
    private static final String DEFAULT_JSON_PATH = "data/exercise44_input.json";
    private final ArrayList<Product> productList = new ArrayList<>();
    private final ProductSearcher productSearcher = new ProductSearcher(productList);
    private final JsonParser jsonParser = new JsonParser(productList, Paths.get(DEFAULT_JSON_PATH));

    public static void main(String[] args) {
        //First, fill the arrayList with products using jsonParser.readJson().
        /*Then, use a while loop to keep on asking for product names via productSearcher.searchProducts(in.nextLine())
        until a valid one is found. If one is, searchProducts will say the name, price, and quantity. Otherwise,
        searchProducts will say that the product wasn't found, making the while loop run it again.*/
    }
}
