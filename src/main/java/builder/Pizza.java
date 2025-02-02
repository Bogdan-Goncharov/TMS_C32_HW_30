package builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private String topping;

    public Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Pizza [dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", topping=" + topping + "]";
    }

    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String cheese;
        private String topping;

        public PizzaBuilder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
