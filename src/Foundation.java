public class Foundation extends Cosmetics {
    private String finish;

    public Foundation(String brand, String name, String description, String finish, double msrp, double price) {
        super(brand, name, description, msrp, price);
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
        return super.toString() + "\nFinish: " + finish;
    }
}
