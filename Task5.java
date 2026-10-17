
/** Task5.java 
 * Check whose largest number in 3 inputs
 * Write a program that takes in three numbers from the user and outputs the largest number. 
 * If all numbers are equal it will print All numbers are eqaul
 */
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in); // Create a Scanner to get input from the user
        for (int i = 0; i < numbers.length; i++){
            String [] label = {"1st","2nd","3rd"}; // Label for 1st to 3rd number to be enter
            System.out.print("Enter " + label[i] +" number: "); // Enter a number 3 times!
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        Arrays.sort(numbers);
        if (numbers[0] == numbers[numbers.length -1]) {
           System.out.println("All numbers are equals");
        }
        else {
           System.out.println("The largest number is " + numbers[numbers.length-1]);
        }
        scanner.close();
    }
}
