package badpractice;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display(String incident) {
        System.out.println(incident + " Product: " + name + " rs. " + price);
    }
}
