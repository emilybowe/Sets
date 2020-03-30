import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private String tagLine;
    private final List<Product> products = new ArrayList<>();

    Supplier(String tagLine) {
        this.tagLine = tagLine;
    }

    public List<Product> products()
    {
        return products;
    }
}
