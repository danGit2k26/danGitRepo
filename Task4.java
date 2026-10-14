
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Create a Scanner to get input from the user
        System.out.print("Enter a string: ");   // Ask the user to enter a string
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();  // Use StringBuilder to reverse the input string
        System.out.println(reversed);
        if (input.equals(reversed)) {   // Compare the original string with the reversed string
            System.out.println("The input string is a palindrome.");  // Display this message if both strings are the same
        } 
        else {
            System.out.println("The input string is not a palindrome."); // Display this message if both strings are different
        }
        scanner.close(); // Close the Scanner
    }
}
