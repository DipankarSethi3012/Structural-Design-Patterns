package goodpractice;

//abstract decorator
//implements pizza and holds the reference to it
public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
