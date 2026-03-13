package goodpractice;

import badpractice.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem{
    private String bundleName;
    private List<CartItem> productList = new ArrayList<>();

    public ProductBundle(String bundleName) {
        this.bundleName = bundleName;
    }

    public void addItem(CartItem cartItem) {
            productList.add(cartItem);
    }
    @Override
    public double getPrice() {
        double total = 0;
        for(CartItem p : productList) {
            total += p.getPrice();
        }

        return total;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + " Bundle: " + bundleName);
        for(CartItem t : productList) {
            t.display(indent + " ");
        }
    }
}
