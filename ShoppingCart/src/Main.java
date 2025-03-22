import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter product id to add product");
        System.out.println("1. Milk");
        System.out.println("2. Bread");
        System.out.println("3. Peanut Butter");
        System.out.println("4. Maggie");
        System.out.println("5. Show cart items");
        System.out.println("6. Show total amount");
        System.out.println("7. Quit");
        System.out.println("------------------------------");

        while (flag) {
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    Product milk = new Product(1, "Milk", 40.0);
                    cart.addToCart(milk);
                    break;
                case 2:
                    Product bread = new Product(2, "Brown Bread", 55.50);
                    cart.addToCart(bread);
                    break;
                case 3:
                    Product peanutButter = new Product(3, "Peanut Butter", 109.20);
                    cart.addToCart(peanutButter);
                    break;
                case 4:
                    Product maggie = new Product(4, "Maggie", 62.0);
                    cart.addToCart(maggie);
                    break;
                case 5:
                    cart.showCartItems();
                    break;
                case 6:
                    double itemsPrice = cart.getTotalItemsPrice();
                    System.out.println("Total price: " + itemsPrice);
                    break;
                case 7:
                    System.out.println("Quit from shopping.");
                    flag = false;
                    break;
            }
        }
    }
    
}