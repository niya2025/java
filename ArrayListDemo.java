// 1. Import the required classes from the java.util package.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Initialize a Scanner object to read user input.
        Scanner sc = new Scanner(System.in);

        // declare the contract as a List, but instantiate the array dynamically.
        List<String> systemLog = new ArrayList<>();

        System.out.println("--- Adding Elements ---");

        // Use the .add() method to insert strings into the collection.
        systemLog.add("Kernel");
        systemLog.add("Bootloader");
        systemLog.add("Daemon");
        systemLog.add("Shell");

        // Print the entire list directly.
        System.out.println(systemLog);

        System.out.println("\n--- Searching for an Element ---");

        // Prompt the user to enter a string to search for
        System.out.print("Enter element to search: ");
        String target = sc.nextLine();

        // Use the .contains() algorithm to check if the target exists.
        if (systemLog.contains(target)) {

            // If true, use .indexOf() to extract its exact position.
            int position = systemLog.indexOf(target);

            // Print a success message
            System.out.println("Element found at position: " + position);

        } else {

            // Print a failure message
            System.out.println("Element not found in the list.");

        }

        System.out.println("\n--- Removing an Element ---");

        // Use the .remove(Object) method to delete a specific string.
        boolean isRemoved = systemLog.remove("Bootloader");

        // Evaluate isRemoved
        if (isRemoved) {
            System.out.println("Bootloader removed successfully.");
        } else {
            System.out.println("Bootloader not found.");
        }

        // Print the list again
        System.out.println(systemLog);

        System.out.println("\n--- Sorting the List ---");

        // Sort the list
        Collections.sort(systemLog);

        // Print the final sorted list
        System.out.println(systemLog);

        // Close scanner
        sc.close();
    }
}
