package object_oriented_programming.vehicle_class_hierarchy;

// Base class for all vehicles
public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double mileage;

    // Constructor
    public Vehicle(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Method to start the vehicle
    public void start() {
        System.out.println("The " + year + " " + make + " " + model + " is starting.");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("The " + year + " " + make + " " + model + " is stopping.");
    }

    // Abstract method for displaying vehicle type
    public abstract void displayVehicleType();
}