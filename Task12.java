
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Scale the point by half
    public void scale() {
        x = x / 2;
        y = y / 2;
    }
}

public class Task12 {
    public static void main(String[] args) {

        Point p = new Point(50, 32);

        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
