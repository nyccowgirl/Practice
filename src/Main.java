import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Foundation skinFet = new Foundation("Pat McGrath Labs", "Skin Fetish",
                "medium coverage luminous glow", "luminous", 78, 68,
				Cosmetics.Inventory.IN_STOCK);
	    Lipstick kissable = new Lipstick("Charlotte Tilbury", "K*I*S*S", "satin lipstick",
                "satin", "Pillow Talk", 38, 35, Cosmetics.Inventory.OUT_OF_STOCK);

	    System.out.println(skinFet);
	    System.out.println(kissable);
	    System.out.println(skinFet.equals(kissable));
	    System.out.println(skinFet.equals(skinFet));

	    ArrayList<Cosmetics> list = new ArrayList<>();
	    list.add(skinFet);
	    list.add(kissable);
	    Collections.sort(list);
	    System.out.println(list);
    }
}
