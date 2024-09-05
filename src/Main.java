import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pizza Order System!");
        System.out.println("Choose your order for:");
        System.out.println("1. Base Pizza");
        System.out.println("2. Delux Pizza");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.println("Veg or Non-Veg ?");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Non-Veg Pizza");
        System.out.print("Enter your choice: ");
        int isVeg = scanner.nextInt();
        scanner.nextLine();

        Pizza pizza;
        if(choice==1 && isVeg==1){
            pizza = new Pizza(true);
        }
        else if (choice==2 && isVeg==1){
            pizza = new DeluxPizza(true);
        }
        else if (choice==1 && isVeg==2){
            pizza = new Pizza(false);
        }
        else if (choice==2 && isVeg==2){
            pizza = new DeluxPizza(false);
        }
        else {
            System.out.println("Invalid choice.. Exiting...");
            return;
        }

        if(choice == 1){
            System.out.print("Do you want to add extra toppings? (yes/no): ");
            String toppingsChoice = scanner.nextLine();
            if (toppingsChoice.equalsIgnoreCase("yes")) {
                pizza.addExtraToppings();
            }

            System.out.print("Do you want to add extra cheese? (yes/no): ");
            String cheeseChoice = scanner.nextLine();
            if (cheeseChoice.equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }
        }

        System.out.print("Do you want to take away? (yes/no): ");
        String takeAwayChoice = scanner.nextLine();
        if (takeAwayChoice.equalsIgnoreCase("yes")) {
            pizza.takeAway();
        }

        pizza.getBill();
    }
}