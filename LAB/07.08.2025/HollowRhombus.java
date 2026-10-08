import java.util.Scanner;

public class HollowRhombus {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number for the size of the rhombus
        System.out.print("Enter a number (e.g., 3 or 4) to generate the hollow rhombus pattern: ");
        
        // Read the integer input from the user
        int n = scanner.nextInt();
        
        // --- Code for the top half of the rhombus (including the middle line) ---
        // The outer loop iterates from 1 to n to print each row of the top half
        for (int i = 1; i <= n; i++) {
            // Inner loop to print the leading spaces before the first number
            // The number of spaces decreases with each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print the first number of the row, which is always 1
            System.out.print("1");
            
            // Check if it's not the first row (i > 1) to print the inner spaces and the second number
            if (i > 1) {
                // Inner loop to print the spaces between the two numbers
                // The number of spaces increases with each row
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                
                // Print the second number of the row, which is always an odd number (2*i - 1)
                System.out.print(2 * i - 1);
            }
            
            // Move to the next line for the next row
            System.out.println();
        }
        
        // --- Code for the bottom half of the rhombus (excluding the middle line) ---
        // The outer loop iterates from n-1 down to 1 to print each row of the bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print the first number of the row, which is always 1
            System.out.print("1");
            
            // Check if it's not the last row of the pattern (i > 1) to print the inner spaces and the second number
            if (i > 1) {
                // Inner loop to print the spaces between the two numbers
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                
                // Print the second number of the row
                System.out.print(2 * i - 1);
            }
            
            // Move to the next line for the next row
            System.out.println();
        }
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}