package zayrango;

import java.util.ArrayList;
import java.util.Scanner;

public class Products {
    public static void main(String[] args) {
        // list of available products, had to ask how to use Arraylist to a ChatGPT
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product("ZR001", "Milk", 28, 4.39));
        productList.add(new Product("ZR002", "Beans", 12, 9.99));
        productList.add(new Product("ZR003", "Grape Juice", 8, 5.59));

        // Here we got a cart, actually hard and complicated, not sure why normal wirting switches to that scary loop using thingy
        ArrayList<Product> cart = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n___ Available Products ___");
            for (int i = 0; i < productList.size(); i++) {
                Product p = productList.get(i);
                System.out.printf("%d - %s (R$ %.2f)%n", i + 1, p.getName(), p.getPrice());
            }

            System.out.print("Choose a product (number) or 0 to finish: ");
            option = scanner.nextInt();

            if (option > 0 && option <= productList.size()) {
                Product selected = productList.get(option - 1);
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();

                // Adding the product with chosen quantity to the cart
                cart.add(new Product(
                        selected.getCode(),
                        selected.getName(),
                        quantity,
                        selected.getPrice()
                ));
            }

        } while (option != 0);

        // And here we show what we got in it
        double total = 0;
        System.out.println("\n___ Final Cart ___");
        for (Product p : cart) {
            double subtotal = p.getQuantity() * p.getPrice();
            System.out.printf("%s (%d x R$ %.2f) = R$ %.2f%n",
                    p.getName(), p.getQuantity(), p.getPrice(), subtotal);
            total += subtotal;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);
        scanner.close();
    }
}
