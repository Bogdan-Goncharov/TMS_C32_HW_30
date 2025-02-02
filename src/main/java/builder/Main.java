package builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setDough("Thin Crust")
                .setSauce("Tomato Basil")
                .setCheese("Mozzarella")
                .setTopping("Pepperoni")
                .build();

        System.out.println(pizza);
    }
}
