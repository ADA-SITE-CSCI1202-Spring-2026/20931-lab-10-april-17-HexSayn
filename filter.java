import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product {
    String name;
    double price;
    boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ", in Stock: " + inStock + ")";
    }
}

public class filter {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 800.00, true));
        products.add(new Product("Mouse", 25.00, true));
        products.add(new Product("Keyboard", 45.00, false));
        products.add(new Product("USB Cable", 15.00, true));

        Predicate<Product> TooExpensiveOROUT = p -> p.price >= 50 || !p.inStock;

        products.removeIf(TooExpensiveOROUT);

        System.out.println("affordable items in stock:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}