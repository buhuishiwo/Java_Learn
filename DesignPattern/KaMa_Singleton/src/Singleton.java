import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author haishili
 * @date 2025/4/30
 */
public class Singleton {
    public static void main(String[] args) {
        CartManager cartManager = CartManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String productName = scanner.next();
            int quantity = scanner.nextInt();
            cartManager.addCart(productName, quantity);
        }
        cartManager.viewCart();
    }
}

class CartManager {
    private static CartManager instance = new CartManager();
    private Map<String,Integer> cart;
    private CartManager() {
        cart = new HashMap<>();
    }
    public static CartManager getInstance() {
        return instance;
    }

    public void addCart(String productName, int quantity) {
        //如果quantity没有值，就默认是0
        cart.put(productName, cart.getOrDefault(productName, 0) + quantity);
    }
    public void viewCart() {
        for (Map.Entry<String,Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}