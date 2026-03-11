package badpractice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product book = new Product("Book", 500);
        Product headphones = new Product("Headphones", 1500);
        Product charger = new Product("Charger", 800);
        Product noteBook = new Product("Notebook", 60);

        //bundle combo
        ProductBundle iphoneCombo = new ProductBundle("iphone combo pack");
        iphoneCombo.addProduct(headphones);
        iphoneCombo.addProduct(charger);


        //Bundle: school kit
        ProductBundle schoolKit = new ProductBundle("School Kit");
        schoolKit.addProduct(book);
        schoolKit.addProduct(noteBook);

        //Add to cart logic
        List<Object> cart = new ArrayList<>(); //The problem started, Can't use the Object in production
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);

        double total = 0;
        for(Object item : cart) {
            if(item instanceof  Product) { //This is not recommended in Production
               total += ((Product) item).getPrice();
            } else if (item instanceof ProductBundle) {
                total += ((ProductBundle) item).getPrice();
            }
        }

        System.out.println("\nTotal price: " + total);


    }
}
