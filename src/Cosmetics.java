public abstract class Cosmetics implements Comparable<Cosmetics> {

    public enum Inventory {
        IN_STOCK("AVAIL"), OUT_OF_STOCK("OUT"), DISCONTINUED("DISC");

        private String abbreviation;

        private Inventory(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

    private int sku;
    private String brand;
    private String name;
    private String description;
    private double msrp;
    private double price;
    private Inventory status;

    private static int nextSKU = 1;

    public Cosmetics(String brand, String name, String description, double msrp, double price, Inventory status) {
        this.sku = nextSKU;
        nextSKU++;
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.msrp = msrp;
        this.price = price;
        this.status = status;
    }

    public int getSku() {
        return sku;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Inventory getStatus() {
        return status;
    }

    public void setStatus(Inventory status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SKU: " + sku + "\tName: " + brand + " " + name + "\tDescription: " + description + "\tMSRP: " + msrp +
                "\tPrice: " + price + "\tInventory: " + status.getAbbreviation();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cosmetics) {
            Cosmetics other = (Cosmetics) obj;
            return (brand.equalsIgnoreCase(other.getBrand()) && name.equalsIgnoreCase(other.getName()) &&
                    description.equalsIgnoreCase(other.getDescription()) && ((msrp - other.getMsrp()) < .01) &&
                    ((price - other.getPrice()) < .01) && status.equals(other.getStatus()));
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Cosmetics obj) {
        if (Double.compare(price, obj.getPrice()) != 0) {
            return Double.compare(price, obj.getPrice());
        } else {
            return Double.compare(msrp, obj.getMsrp());
        }
    }

    public static int totalSkus() {
        return nextSKU - 1;
    }
}
