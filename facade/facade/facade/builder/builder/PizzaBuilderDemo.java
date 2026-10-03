package builder;

public class PizzaBuilderDemo {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder()
                .setSize("Large")
                .setDough("Thin")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .setTopping("Chicken")
                .build();

        pizza.showPizza();
    }
}
