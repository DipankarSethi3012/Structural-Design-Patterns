package goodpractice;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new StuffedCrust(new Olives(new ExtraCheese(new PlainPizza())));
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
