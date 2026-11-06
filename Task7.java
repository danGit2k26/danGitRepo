import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner to get input from the user

        System.out.print("Enter 1st number: "); // Enter 1st number
        int num0 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter 2nd number: "); // Enter 2nd number
        int num1 = scanner.nextInt();
        scanner.nextLine();

        int sumOfnumbers = num0 + num1;
        int difOfnumbers = num0 - num1;
        int prodOfnumbers = num0 * num1;
        double quoOfnumbers = num0 / num1;

        System.out.println("The SUM of the two inputted numbers: " + sumOfnumbers);
        System.out.println("The DIFFERENCE of the two inputted numbers: " + difOfnumbers);
        System.out.println("The PRODUCT of the two inputted numbers: " + prodOfnumbers);
        System.out.println("The QUOTIENT of the two inputted numbers: " + quoOfnumbers);
    }
}