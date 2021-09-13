import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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
    private BigDecimal msrp;
    private BigDecimal price;
    private Inventory status;

    private static int nextSKU = 1;
    private final static int DECIMALS = 2;
    private final static RoundingMode ROUNDING_MODE = RoundingMode.HALF_EVEN;
    DecimalFormat df = new DecimalFormat("$#,##0.00");

    public Cosmetics(String brand, String name, String description, BigDecimal msrp, BigDecimal price,
                     Inventory status) {
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

    public BigDecimal getMsrp() {
        return msrp;
    }

    public void setMsrp(BigDecimal msrp) {
        this.msrp = msrp;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Inventory getStatus() {
        return status;
    }

    public void setStatus(Inventory status) {
        this.status = status;
    }

    public static int getTotalSkus() {
        return Cosmetics.nextSKU - 1;
    }

    @Override
    public String toString() {
        return "SKU: " + sku + "\tName: " + brand + " " + name + "\tDescription: " + description +
                "\tMSRP: " + df.format(msrp.setScale(DECIMALS, ROUNDING_MODE)) +
                "\tPrice: " + df.format(price.setScale(DECIMALS, ROUNDING_MODE)) +
                "\tInventory: " + status.getAbbreviation();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cosmetics) {
            Cosmetics other = (Cosmetics) obj;
            return (sku == other.getSku() && brand.equalsIgnoreCase(other.getBrand()) &&
                    name.equalsIgnoreCase(other.getName()) && description.equalsIgnoreCase(other.getDescription()) &&
                    msrp.equals(other.getMsrp()) && price.equals(other.getPrice()) && status.equals(other.getStatus()));
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Cosmetics obj) {
        if (price.compareTo(obj.getPrice()) != 0) {
            return price.compareTo(obj.getPrice());
        } else {
            return msrp.compareTo(obj.getMsrp());
        }
    }
}
