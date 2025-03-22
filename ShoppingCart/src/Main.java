//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Product milk = new Product(1, "Milk", 40.0);
        Product bread = new Product(2, "Brown Bread", 55.50);
        Product peanutButter = new Product(3, "Peanut Butter", 109.20);
        Product maggie = new Product(4, "Maggie", 62.0);
        cart.addToCart(milk);
        cart.addToCart(bread);
        cart.addToCart(peanutButter);
        cart.addToCart(maggie);

        cart.showCartItems();

        double total = cart.getTotalItemsPrice();
        System.out.println("total bill: "+total);
    }

}