public class PepperoniDecorator implements Pizza {
    private Pizza pizza;

    public PepperoniDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + 3.0; // Additional cost of pepperoni
    }
}
