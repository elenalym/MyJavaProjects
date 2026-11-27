import java.util.Scanner;

/**
 * Interactive console application that calculates tip and splits a bill evenly
 * among a given number of people.
 */
public class BillSplitter {
    static void main(String[] args) {

        // Initialize Scanner to read input from the console
        Scanner input = new Scanner(System.in);

        // Display the title
        String border = "=".repeat(32);
        System.out.println(border);
        System.out.println("        BILL SPLITTER     ");
        System.out.println(border);

        // Read the bill amount safely via nextLine() + trim()
        System.out.println("What is the bill amount?");
        double billAmount = Double.parseDouble(input.nextLine().trim());

        // Read tip percentage
        System.out.println("What tip percentage would you like to add?");
        double tipPercentage = Double.parseDouble(input.nextLine().trim());

        // Asks whether the user wants to split the bill
        System.out.println("Do you want to split the bill?");
        String splitBill = input.nextLine().trim().toLowerCase();

        // Validate basic inputs
        if (billAmount <= 0 || tipPercentage < 0) {
            System.out.println("Invalid input, please enter a positive number.");
            return;
        }

        // Calculate total tip amount
        double tipAmount = billAmount * (tipPercentage / 100.0);

        if (splitBill.equals("yes")) {
            // Ask how many people are splitting the bill
            System.out.println("How many people are splitting the bill?");
            int splitAmount = Integer.parseInt(input.nextLine().trim());

            if (splitAmount <= 0) {
                System.out.println("Please add at least one people to split the bill.");
                return;
            }
            // Calculate tip per person and total per person
            double tipPerPerson = tipAmount / splitAmount;
            double totalPerPerson = (billAmount + tipAmount) / splitAmount;

            // Print summary when splitting
            System.out.println(border);
            System.out.println("           SUMMARY        ");
            System.out.println(border);
            System.out.printf("Bill amount: %.2f%n", billAmount);
            System.out.printf("Tip amount per person: %.2f%n", tipPerPerson);
            System.out.printf("Total amount per person: %.2f%n", totalPerPerson);

        } else if (splitBill.equals("no")) {
            // Calculate total with tip when not splitting
            double finalAmount = billAmount + tipAmount;

            // Print summary when not splitting
            System.out.println(border);
            System.out.println("           SUMMARY         ");
            System.out.println(border);
            System.out.printf("Bill amount: %.2f%n", billAmount);
            System.out.printf("Tip amount: %.2f%n", tipAmount);
            System.out.printf("Total amount: %.2f%n", finalAmount);

        } else {
            // Fallback if user types something other than yes or no
            System.out.println("Invalid input, please enter yes or no");
        }
    }
}
