package goodpractice;
//Concrete Decorators: Add Extra Cheese
public class ExtraCheese extends  PizzaDecorator{

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50.25;
    }
}
