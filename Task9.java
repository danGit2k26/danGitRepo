
import static java.lang.Math.*;

public class Task9 {

    // Addition
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division
    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {

        // Demonstrate the math basic operations
        System.out.println("Addition: " + add(100, 25));
        System.out.println("Subtraction: " + subtract(100, 25));
        System.out.println("Multiplication: " + multiply(100, 25));
        System.out.println("Division: " + divide(100, 25));
    }
}
