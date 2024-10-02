public class CheeseDecorator implements Pizza {
    private Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + 2.0; // Additional cost of cheese
    }
}
