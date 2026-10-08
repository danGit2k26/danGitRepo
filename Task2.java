/**
 * Task2
 * Create all the primitives (except long and double) with different values.
 * Concatenate them into a string and print it to the screen so it will print:
 * H3110 w0r1d 2.0 true 
 */
public class Task2 {
    public static void main(String[] args) {
        byte zero = 0;
        boolean tof = true;
        short one = 1;
        int x = 3110;
        float y = 2.0f;
        char w = 'w';
        char r = 'r';
        char d = 'd';
        String result = "H" + x + " " + w + zero + r + one + d + " " + y + " " + tof;
        System.out.println(result);
        System.out.println("Git connection successfully!");
    }
}