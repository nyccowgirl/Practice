public class Lipstick extends Cosmetics{
    private String type;
    private String color;

    public Lipstick(String brand, String name, String description, String type, String color, double msrp,
                    double price, Inventory status) {
        super(brand, name, description, msrp, price, status);
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\tType: " + type + "\tColor: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Lipstick) {
            Lipstick other = (Lipstick) obj;
            return (super.equals(obj) && type.equalsIgnoreCase(other.getType()) &&
                    color.equalsIgnoreCase(other.getColor()));
        } else {
            return false;
        }
    }
}
