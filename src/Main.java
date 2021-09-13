import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Foundation skinFet = new Foundation("Pat McGrath Labs", "Skin Fetish",
                "medium coverage luminous glow", "luminous", BigDecimal.valueOf(78),
				BigDecimal.valueOf(68), 25, Cosmetics.Inventory.IN_STOCK);
	    Lipstick kissable = new Lipstick("Charlotte Tilbury", "K*I*S*S", "satin lipstick",
                "satin", "Pillow Talk", BigDecimal.valueOf(38), BigDecimal.valueOf(35), 77,
				Cosmetics.Inventory.OUT_OF_STOCK);

	    System.out.println(skinFet);
	    System.out.println(kissable);
	    System.out.println(skinFet.equals(kissable));
	    System.out.println(skinFet.equals(skinFet));

		skinFet.setQuantity(0);

	    ArrayList<Cosmetics> list = new ArrayList<>();
	    list.add(skinFet);
	    list.add(kissable);
	    Collections.sort(list);
	    System.out.println(list);

		System.out.println("Total Product Types: " + Cosmetics.getTotalSkus());
		System.out.println("Total Inventory Quantity: " + Cosmetics.getTotalInventory());
    }
}
