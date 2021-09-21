public class Lipstick extends Cosmetics{
    private String type;
    private String color = DEFAULT_COLOR;

    private static final String DEFAULT_COLOR = "N/A";

    private Lipstick(Cosmetics.Builder<?, ?> cosmeticsBuilder, Builder lipstickBuilder) {
        super(cosmeticsBuilder);
        this.type = lipstickBuilder.account.type;
        this.color = lipstickBuilder.account.color;
    }

    private Lipstick() {}

    public static class Builder extends Cosmetics.Builder<Lipstick, Lipstick.Builder> {

        public Builder(String brand, String name) {
            super(brand, name);
        }

        public Builder type(String type) {
            account.type = type;
            return builder;
        }

        public Builder color(String color) {
            account.color = color;
            return builder;
        }

        protected Lipstick createCosmetics(Cosmetics.Builder<Lipstick, Builder> builder) {
            return new Lipstick(builder, this);
        }

        protected Lipstick createCosmetics() {
            return new Lipstick();
        }

        public Builder getBuilder() {
            return this;
        }
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
