public class Lipstick extends Cosmetics{
    private String type;
    private String color;

    public Lipstick(String brand, String name, String description, String type, String color, double msrp,
                    double price) {
        super(brand, name, description, msrp, price);
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + type + "\nColor: " + color;
    }
}
