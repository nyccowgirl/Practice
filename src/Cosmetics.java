public class Cosmetics {
    private int sku;
    private String brand;
    private String name;
    private String description;
    private double msrp;
    private double price;

    private static int nextSKU = 1;

    public Cosmetics(String brand, String name, String description, double msrp, double price) {
        this.sku = nextSKU;
        nextSKU++;
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.msrp = msrp;
        this.price = price;
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

    @Override
    public String toString() {
        return "Name: " + brand + " " + name + "\nDescription: " + description + "\nMSRP: " + msrp +
                "\nPrice: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cosmetics) {
            Cosmetics other = (Cosmetics) obj;
            return (brand.equalsIgnoreCase(other.getBrand()) && name.equalsIgnoreCase(other.getName()) &&
                    description.equalsIgnoreCase(other.getDescription()) && ((msrp - other.getMsrp()) < .01) &&
                    ((price - other.getPrice()) < .01));
        } else {
            return false;
        }
    }
}
