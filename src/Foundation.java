public class Foundation extends Cosmetics {
    private String finish;

    private Foundation(Cosmetics.Builder<?, ?> cosmeticsBuilder, Builder foundationBuilder) {
        super(cosmeticsBuilder);
        this.finish = foundationBuilder.account.finish;
    }

    private Foundation() {}

    public static class Builder extends Cosmetics.Builder<Foundation, Foundation.Builder> {

        public Builder(String brand, String name) {
            super(brand, name);
        }

        public Builder finish(String finish) {
            account.finish = finish;
            return builder;
        }

        protected Foundation createCosmetics(Cosmetics.Builder<Foundation, Builder> builder) {
            return new Foundation(builder, this);
        }

        protected Foundation createCosmetics() {
            return new Foundation();
        }

        protected Builder getBuilder() {
            return this;
        }
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
