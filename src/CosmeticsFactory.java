import java.math.BigDecimal;

public class CosmeticsFactory {

    public static Cosmetics newCosmetics(Category category, String brand, String name, String description,
                                         String finish, BigDecimal msrp, BigDecimal price, int quantity,
                                         Inventory status) {
        Cosmetics c;

        if (category.equals(Category.FOUNDATION)) {
            c = new Foundation(brand, name, description, finish, msrp, price, quantity, status);
        } else if (category.equals(Category.LIPSTICK)) {
            c = new Lipstick(brand, name, description, finish, msrp, price, quantity, status);
        } else {
            throw new IllegalArgumentException("Not a valid type of cosmetics.");
        }

        return c;
    }
}
