
public class Task8 {

    // Method using variable arguments (varargs)
    public static int calculateSum(int... numbers) {
        
        int total = 0;
        // Loop through each parameter
        for (int number : numbers) {
            int cumulativeSum = 0;

            // Calculate the sum from 1 up to the current number
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }
            System.out.println("Cumulative sum of " + number + ": " + cumulativeSum);
            // Add the cumulative sum to the total
            total += cumulativeSum;
        }
        return total;
    }
    public static void main(String[] args) {
        int result = calculateSum(4, 5, 10);
        System.out.println("Total sum: " + result);
    }
}
