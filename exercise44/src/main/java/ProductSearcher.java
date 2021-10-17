import java.util.List;

public class ProductSearcher {
    List<Product> productList;

    public ProductSearcher(List<Product> productListIn) {
        //Simply set productList to productListIn.
        this.productList = productListIn;
    }

    public boolean searchProducts(String searchString) {
        //For each product in the list, compare searchString to the name.
        //If they match (case-insensitive), then say the data of the product. and return true.
        //If they don't, move on to the next product.
        //If there was no match in the entire list, say that the product was not found and return false.
        return false;
    }
}
