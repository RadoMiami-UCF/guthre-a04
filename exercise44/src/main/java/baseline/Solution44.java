package baseline;

import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution44 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final String DEFAULT_JSON_PATH = "data/exercise44_input.json";
    private ArrayList<Product> productList = new ArrayList<>();
    private final JsonParser jsonParser = new JsonParser(Paths.get(DEFAULT_JSON_PATH));

    public static void main(String[] args) {
        //First, make an instance of baseline.Solution44.
        var app = new Solution44();
        //Then, fill the arrayList with products using jsonParser.readJson().
        app.productList = (ArrayList<Product>) app.jsonParser.readJson();
        /*Then, use a while loop to keep on asking for product names via productSearcher.searchProducts(in.nextLine())
        until a valid one is found. If one is, searchProducts will say the name, price, and quantity. Otherwise,
        searchProducts will say that the product wasn't found, making the while loop run it again.*/
        var productSearcher = new ProductSearcher(app.productList);
        do {
            //Ask for the product name.
            System.out.print("What is the product name? ");
            //Then, pass the next input into searchProducts().
        } while(!productSearcher.searchProducts(in.nextLine()));
    }
}
