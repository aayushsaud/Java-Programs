package object_oriented_programming.vehicle_class_hierarchy;

// Car class derived from Vehicle
public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isConvertible;

    // Constructor
    public Car(String make, String model, int year, double mileage, int numberOfDoors, boolean isConvertible) {
        super(make, model, year, mileage);
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }

    // Method to display car-specific details
    @Override
    public void displayVehicleType() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Convertible: " + (isConvertible ? "Yes" : "No"));
    }
}