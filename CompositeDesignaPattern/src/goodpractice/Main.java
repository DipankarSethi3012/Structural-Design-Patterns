package goodpractice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CartItem book = new Product("Atomic Habits", 499.0);
        CartItem phone = new Product("iphone", 111111);
        CartItem earbuds = new Product("earbuds", 999.0);

        ProductBundle iphoneCombo = new ProductBundle("iphone Essentials Combo");
        iphoneCombo.addItem(phone);
        iphoneCombo.addItem(earbuds);

        System.out.println("Adding products into list");

        //add everything to cart
        List<CartItem> li = new ArrayList<>();
        li.add(book);
        li.add(iphoneCombo);

        double total = 0;
        for(CartItem item : li) {
            item.display(" ");
            total += item.getPrice();
        }

        System.out.println(total);
    }
}
