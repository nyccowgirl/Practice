import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Foundation skinFet = new Foundation("Pat McGrath Labs", "Skin Fetish",
                "medium coverage luminous glow", "luminous", BigDecimal.valueOf(78),
				BigDecimal.valueOf(68), 25, Inventory.IN_STOCK);
	    Lipstick kissable = new Lipstick("Charlotte Tilbury", "K*I*S*S", "satin lipstick",
                "satin", "Pillow Talk", BigDecimal.valueOf(38), BigDecimal.valueOf(35), 77,
				Inventory.IN_STOCK);

	    System.out.println(skinFet);
	    System.out.println(kissable);
	    System.out.println(skinFet.equals(kissable));
	    System.out.println(skinFet.equals(skinFet));

		skinFet.setQuantity(0);

		Store nyc = new Store();
		nyc.addCosmetic(skinFet);
		Store sf = new Store();
		sf.addCosmetic(kissable);

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.print("Enter the store location (NYC, SF): ");
			String store = scan.nextLine();
			System.out.print("Enter the cosmetics category (1 - foundation; 2 - lipstick): ");
			int choice1 = Integer.parseInt(scan.nextLine());
			Category cat = Category.NOT_APPLICABLE;

			switch (choice1) {
				case 1: cat = Category.FOUNDATION;
					break;
				case 2: cat = Category.LIPSTICK;
					break;
				default: System.out.println("Not a valid input.");
			}

			System.out.print("Enter the brand: ");
			String brand = scan.nextLine();
			System.out.print("Enter the name of the product: ");
			String name = scan.nextLine();
			System.out.print("Enter the description: ");
			String desc = scan.nextLine();
			System.out.print("Enter the finish: ");
			String finish = scan.nextLine();
			System.out.print("Enter the MSRP: ");
			BigDecimal msrp = scan.nextBigDecimal();
			scan.nextLine();
			//BigDecimal msrp = new BigDecimal(Double.parseDouble(scan.nextLine());
			System.out.print("Enter the price: ");
			BigDecimal price = scan.nextBigDecimal();
			scan.nextLine();
			//BigDecimal price = new BigDecimal(Double.parseDouble(scan.nextLine());
			System.out.print("Enter the quantity in inventory: ");
			int quantity = Integer.parseInt(scan.nextLine());
			System.out.print("Enter the inventory status (1 - in stock; 2 - out of stock; 3 - discontinued): ");
			int choice2 = Integer.parseInt(scan.nextLine());
			Inventory status = Inventory.NOT_APPLICABLE;

			switch (choice2) {
				case 1: status = Inventory.IN_STOCK;
						break;
				case 2: status = Inventory.OUT_OF_STOCK;
						break;
				case 3: status = Inventory.DISCONTINUED;
						break;
				default: System.out.println("Not a valid input.");
			}

			switch (store) {
				case "NYC": nyc.addCosmetic(cat, brand, name, desc, finish, msrp, price, quantity, status);
							break;
				case "SF":	sf.addCosmetic(cat, brand, name, desc, finish, msrp, price, quantity, status);
							break;
				default:	System.out.println("Not a valid store.");
			}

		}

		System.out.println();
		nyc.sort();
		sf.sort();
		System.out.println(nyc);
		System.out.println(sf);
		System.out.println();

	    ArrayList<Cosmetics> list = new ArrayList<>();
	    list.add(skinFet);
	    list.add(kissable);
	    Collections.sort(list);
	    System.out.println(list);

		System.out.println("Total Product Types: " + Cosmetics.getTotalSkus());
		System.out.println("Total Inventory Quantity: " + Cosmetics.getTotalInventory());
		System.out.println("Total Inventory Quantity at NYC Store: " + nyc.getTotalInventory());
		System.out.println("Total Inventory Quantity at SF Store: " + sf.getTotalInventory());

	}
}
