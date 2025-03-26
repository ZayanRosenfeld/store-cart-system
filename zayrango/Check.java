package zayrango;

import java.util.ArrayList;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {

        //it is a logical part here, Java works differently from python, so the classes we created earlier is actually a blueprints
        //So to utilize, we gotta create a class object again with actual data that we gonna use, for example:
        Client client = new Client("328", "Anderson Cruz", "999.666.123-45", "14.02.2005");

        Store store = new Store("001", "Zayrango", "98.980.980/4546", "JoaoDuraMais LTDA", "Rio Vermelho 2140");

        ArrayList<Product> productList = new ArrayList<>();

productList.add(new Product("ZR001", "Milk", 28, 4.39));
productList.add(new Product("ZR002", "Beans", 12, 9.99));
productList.add(new Product("ZR003", "Grape Juice", 8, 5.59));

ArrayList<Product> cart = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
int option;

do {
    System.out.println("\n___ Available Products ___");
    for (int i = 0; i < productList.size(); i++) {
        Product p = productList.get(i);
        System.out.printf("%d - %s (R$ %.2f) - Available: %d%n", i + 1, p.getName(), p.getPrice(), p.getQuantity());

    }

    System.out.print("Choose a product (number) or 0 to finish: ");
    option = scanner.nextInt();

    if (option > 0 && option <= productList.size()) {
        Product selected = productList.get(option - 1);
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        cart.add(new Product(
                selected.getCode(),
                selected.getName(),
                quantity,
                selected.getPrice()
        ));
    }

} while (option != 0);
System.out.println("\n======== NOTA FISCAL ========");
store.showStore();
System.out.println();
client.showClient();

double total = 0;
int totalItems = 0;

System.out.println("\n--- Bought Products ---");
for (Product p : cart) {
    double subtotal = p.getQuantity() * p.getPrice();
    System.out.printf("%s (%d x R$ %.2f) = R$ %.2f%n",
            p.getName(), p.getQuantity(), p.getPrice(), subtotal);
    total += subtotal;
    totalItems += p.getQuantity();
}

System.out.println("----------------------------");
System.out.println("Total de itens: " + totalItems);
System.out.printf("Valor total: R$ %.2f%n", total);
scanner.close();

    }
}