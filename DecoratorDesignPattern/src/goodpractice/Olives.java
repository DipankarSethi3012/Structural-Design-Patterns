package goodpractice;
//Concrete Adapters: Extra Olives
public class Olives extends PizzaDecorator{
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " extra olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40.0;
    }
}
