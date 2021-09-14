import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Store {

    private List<Cosmetics> cosmeticList;

    public Store() {
        cosmeticList = new ArrayList<>();
    }

    public void addCosmetic(Cosmetics c) {
        cosmeticList.add(c);
    }

    public void addCosmetic(Category category, String brand, String name, String description, String finish,
                            BigDecimal msrp, BigDecimal price, int quantity, Inventory status) {
        Cosmetics c = CosmeticsFactory.newCosmetics(category, brand, name, description, finish, msrp, price, quantity,
                status);
        addCosmetic(c);
    }

    @Override
    public String toString() {
        String print = "[";

        for (Cosmetics c: cosmeticList) {
            print += (c.toString() + "\n");
        }
        print += "]";

        return print;
    }

    public void sort() {
        Collections.sort(cosmeticList);
    }

    public int getTotalInventory() {
        int totalInventory = 0;

        for (Cosmetics c: cosmeticList) {
            totalInventory += c.getQuantity();
        }

        return totalInventory;
    }
}
