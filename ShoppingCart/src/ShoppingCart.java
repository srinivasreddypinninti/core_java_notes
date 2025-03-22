import java.util.ArrayList;
import java.util.Comparator;

public class ShoppingCart {

    private ArrayList<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public boolean addToCart(Product product) {
        if (!cart.contains(product)) {
            cart.add(product);
            return true;
        } else {
            System.out.println(product.getName()+" is already added to cart.");
            return false;
        }
    }

    public boolean removeItem(Product product) {
        if (cart.contains(product)) {
            return  cart.remove(product);
        } else {
            System.out.println(product.getName()+" is not available in cart.");
            return false;
        }
    }

    public void showCartItems() {
        System.out.println(cart);
    }

    public double getTotalItemsPrice() {
        double sum = 0.0;
        for (Product product : cart) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void priceLowToHigh(){
        cart.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double priceDiff = o1.getPrice() - o2.getPrice();
                if (priceDiff < 0) {
                    return -1;
                } else if (priceDiff > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(cart);
    }

    public void priceHighToLow(){
        cart.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double priceDiff = o2.getPrice() - o1.getPrice();
                if (priceDiff < 0) {
                    return -1;
                } else if (priceDiff > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(cart);
    }
}
