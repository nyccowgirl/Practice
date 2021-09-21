import java.math.BigDecimal;

public class CosmeticsFactory {

    public static Cosmetics newCosmetics(Category category, String brand, String name, String description,
                                         String finish, BigDecimal msrp, BigDecimal price, int quantity,
                                         Inventory status) {
        Cosmetics c;

        if (category.equals(Category.FOUNDATION)) {
            c = new Foundation.Builder(brand, name)
                    .description(description)
                    .finish(finish)
                    .msrp(msrp)
                    .price(price)
                    .quantity(quantity)
                    .status(status)
                    .build();
        } else if (category.equals(Category.LIPSTICK)) {
            c = new Lipstick.Builder(brand, name)
                    .description(description)
                    .type(finish)
                    .msrp(msrp)
                    .price(price)
                    .quantity(quantity)
                    .status(status)
                    .build();
        } else {
            throw new IllegalArgumentException("Not a valid type of cosmetics.");
        }

        return c;
    }
}
