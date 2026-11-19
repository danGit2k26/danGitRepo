class Vehicle {

    // Vehicle attributes
    String make;
    String model;
    int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
// Derived class
class Car extends Vehicle {

    // Additional attribute
    int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    // Display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Land Cruiser FJ", 2026, 4);  // Create a Car object
        car.displayDetails(); // Display car details
    }
}
