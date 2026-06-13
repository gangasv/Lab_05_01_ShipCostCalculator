import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        //Scanner object to read from the console
        Scanner in = new Scanner(System.in);

        //Declare variables
        double itemPrice = 0.0;
        double shippingCost = 0.0;
        double totalPrice = 0.0;
        String trash = ""; // To display invalid text input

        // Ask user for item price
        System.out.print("Enter the price of your item: $");

        // Check if the input is a double
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // Clear the newline from the buffer

            // Calculate shipping cost
            if (itemPrice >= 100.0) {
                shippingCost = 0.0;
            }
            else {
                shippingCost = itemPrice * 0.02;
            }

            // Calculate the total price
            totalPrice = itemPrice + shippingCost;

            //Output
            System.out.println("Item Price: $" + itemPrice);
            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" +  totalPrice);
        }
        else {
            // Not a double, read as a String
            trash = in.nextLine();
            System.out.println("Error: '" + trash + "' is not a valid price.");
            System.out.println("Please run the program again and enter a valid item price");
        }
    }
}