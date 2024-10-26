package object_oriented_programming.vehicle_class_hierarchy;

// Truck class derived from Vehicle
public class Truck extends Vehicle {
    private double payloadCapacity; // in tons
    private int numberOfAxles;

    // Constructor
    public Truck(String make, String model, int year, double mileage, double payloadCapacity, int numberOfAxles) {
        super(make, model, year, mileage);
        this.payloadCapacity = payloadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    // Method to display truck-specific details
    @Override
    public void displayVehicleType() {
        System.out.println("Vehicle Type: Truck");
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        System.out.println("Number of Axles: " + numberOfAxles);
    }
}