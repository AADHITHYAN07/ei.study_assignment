public class MainDecorator {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);

        System.out.println("Total cost: $" + pizza.cost()); // Output: Total cost: $13.0
    }
}
