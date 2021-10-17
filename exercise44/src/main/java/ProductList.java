import java.util.ArrayList;
import java.util.List;

public class ProductList {
    //A wrapper object for lists of products so that gson works properly.
    private List<Product> products;

    public ProductList(List<Product> inProductList) {
        //Simply set products to inProductList.
        this.products = inProductList;
    }

    public List<Product> getList() {
        //Get method for the arrayList.
        return new ArrayList<>(products);
    }
}
