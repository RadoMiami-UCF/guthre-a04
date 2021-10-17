package baseline;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonParser {
    private final Path pathToJson;

    public JsonParser(Path pathToJsonIn) {
        //Set each value to their respective parameters.
        this.pathToJson = pathToJsonIn;
    }

    public List<Product> readJson() {
        //First, turn the file at pathToJson into a string.
        //Then, do fromJson([the string], ProductList.class).
        var gson = new Gson();
        var products = new ProductList(new ArrayList<>());
        try {
            products = gson.fromJson(Files.readString(pathToJson), ProductList.class);
        } catch (IOException exception) {
            var logger = Logger.getLogger("IOExceptionLogger");
            logger.log(Level.SEVERE, "Unforeseen I/O error!", exception);
        }

        //Finally, set the products.getList().
        return products.getList();
    }
}
