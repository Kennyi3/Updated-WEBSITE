import java.util.Scanner;

public class P1Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays to store fruits and their corresponding prices
        String[] fruits = {"Apple", "Peaches", "Pineapple", "Orange", "Lime"};
        int[] prices = {10, 10, 35, 10, 10};
        char choice = 'N';
        int quantity, total = 0;

        do {
            // Display the menu of fruits with prices
            System.out.println("Menu:");
            for (int i = 0; i < fruits.length; i++) {
                System.out.println(fruits[i] + ": " + prices[i] + " pesos");
            }

            // Prompt the user to make a selection
            System.out.print("\nWhat do you like?\n" +
                    "A for Apple\n" +
                    "P for Peaches\n" +
                    "PA for Pineapple\n" +
                    "O for Orange\n" +
                    "L for Lime\n" +
                    "Enter Selection: ");
            String selection = scanner.next().toUpperCase();

            // Determine the index of the selected fruit
            int index;
            switch (selection) {
                case "A":
                    index = 0;
                    break;
                case "P":
                    index = 1;
                    break;
                case "PA":
                    index = 2;
                    break;
                case "O":
                    index = 3;
                    break;
                case "L":
                    index = 4;
                    break;
                default:
                    System.out.println("Invalid selection.");
                    continue; // Restart the loop if the selection is invalid
            }

            // Prompt the user for the quantity of the selected fruit
            System.out.print("How many Pieces: ");
            quantity = scanner.nextInt();
            total += prices[index] * quantity; // Calculate the total price

            // Prompt the user if they want to order another item
            System.out.print("\nWould you like to have another order: (Y/N) ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Display the total price
        System.out.println("Total: " + total + " pesos");

        // Apply discount if the total price is 500 pesos or more
        if (total >= 500) {
            double discountedTotal = total * 0.90; // Apply 10% discount
            System.out.println("Discounted Total: " + discountedTotal + " pesos");
        }
    }
}