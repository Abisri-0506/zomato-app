import java.util.Scanner;

public class ZomatoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to Zomato App!");
        System.out.println("Please choose an option:");
        System.out.println("1. Search for a Restaurant");
        System.out.println("2. View Restaurant Menu");
        System.out.println("3. Place an Order");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();  

        
        switch (choice) {
            case 1:  
                System.out.print("Enter the restaurant name: ");
                String restaurant = scanner.next();
                System.out.println("Searching for restaurant: " + restaurant);
                break;

            case 2:  
                System.out.println("Here is the menu:");
                System.out.println("1. Pizza - $120");
                System.out.println("2. Burger - $80");
                System.out.println("3. Pasta - $100");
                System.out.println("4. Salad - $50");
                break;

            case 3:  
                System.out.println("Enter the item number to place an order:");
                System.out.println("1. Pizza");
                System.out.println("2. Burger");
                System.out.println("3. Pasta");
                System.out.println("4. Salad");
                int item = scanner.nextInt();
                switch (item) {
                    case 1:
                        System.out.println("You have ordered Pizza");
                        break;
                    case 2:
                        System.out.println("You have ordered a Burger.");

                        break;
                    case 3:
                        System.out.println("You have ordered Pasta.");
                        break;
                    case 4:
                        System.out.println("You have ordered a Salad.");
                        break;
                    default:
                        System.out.println("Invalid item number.");
                        break;
                }
                break;

            case 4: 
                System.out.println("Thank you for using Zomato! Have a great day!");
                break;

            default:  // Invalid option
                System.out.println("Invalid option! Please choose a valid number.");
                break;
        }

        scanner.close();
    }
}

