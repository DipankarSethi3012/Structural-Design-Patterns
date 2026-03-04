package badpractice;

public class Main {
    public static void main(String[] args) {
        PlainPizza pizza = new PlainPizza();

        //pizza with individual toppings
        CheesePizza cheesePizza = new CheesePizza();
        OlivePizza olivePizza = new OlivePizza();
        StuffedPizza stuffedPizza = new StuffedPizza();

        //combination of toppings require s separate classes
        CheeseStuffedPizza cheeseStuffedPizza = new CheeseStuffedPizza();
        CheeseOlivePizza cheeseOlivePizza = new CheeseOlivePizza();

        //further combinations increase complexity exponentially
        CheeseOliveStuffedPizza cheeseOliveStuffedPizza = new CheeseOliveStuffedPizza();


    }
}

//This quickly becomes un-manageable. Here the decorator pattern comes into play, it lets you compose behaviours using wrappers instead of subclassing