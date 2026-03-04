package goodpractice;

public class StuffedCrust extends PizzaDecorator{
    public StuffedCrust(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " using stuffed crust";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 100.35;
    }
}
