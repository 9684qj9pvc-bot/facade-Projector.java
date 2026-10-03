package builder;

public class Pizza {

    private String size;
    private String dough;
    private String sauce;
    private String cheese;
    private String topping;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.topping = builder.topping;
    }

    public void showPizza() {
        System.out.println("Pizza:");
        System.out.println("Size: " + size);
        System.out.println("Dough: " + dough);
        System.out.println("Sauce: " + sauce);
        System.out.println("Cheese: " + cheese);
        System.out.println("Topping: " + topping);
    }

    public static class Builder {

        private String size;
        private String dough;
        private String sauce;
        private String cheese;
        private String topping;

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
