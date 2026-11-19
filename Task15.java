import java.lang.Math;

// Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
// Abstract class
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;
    // Constructor
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    // Area calculation for a rectangle
    public double calculateArea() {
        return length * width;
    }
    // Perimeter calculation for a rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
// Circle class
class Circle extends AbstractShape {
    double radius;
    public Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
    }
    // Area calculation
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Perimeter calculation
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
// Rectangle class
class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
}

public class Task15 {
    public static void main(String[] args) {
        // Create Circle and Rectangle objects
        Circle circle = new Circle("Moss Green", 10);
        Rectangle rectangle = new Rectangle("Rythm Blue", 26, 5);
        
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.color);
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());

        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());
    }
}
