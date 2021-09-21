import java.math.BigDecimal;

public class Foundation extends Cosmetics {
    private String finish;

    public Foundation(Builder builder) {
        super(builder);
    }

    public static class Builder extends Cosmetics.Builder {
        private String finish;

        public Builder(String brand, String name) {
            super(brand, name);
        }

        public Builder finish(String finish) {
            this.finish = finish;
            return this;
        }

        public Foundation build() {
            return new Foundation(this);
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
