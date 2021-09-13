import java.math.BigDecimal;

public class Foundation extends Cosmetics {
    private String finish;

    public Foundation(String brand, String name, String description, String finish, BigDecimal msrp, BigDecimal price,
                      Inventory status) {
        super(brand, name, description, msrp, price, status);
        this.finish = finish;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return super.toString() + "\tFinish: " + finish;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Foundation) {
            Foundation other = (Foundation) obj;
            return (super.equals(obj) && finish.equalsIgnoreCase(other.getFinish()));
        } else {
            return false;
        }
    }
}
