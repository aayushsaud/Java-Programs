package object_oriented_programming.vehicle_class_hierarchy;

// Bike class derived from Vehicle
public class Bike extends Vehicle {
    private int engineCapacity; // in cc
    private boolean isSportBike;

    // Constructor
    public Bike(String make, String model, int year, double mileage, int engineCapacity, boolean isSportBike) {
        super(make, model, year, mileage);
        this.engineCapacity = engineCapacity;
        this.isSportBike = isSportBike;
    }

    // Method to display bike-specific details
    @Override
    public void displayVehicleType() {
        System.out.println("Vehicle Type: Bike");
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Sport Bike: " + (isSportBike ? "Yes" : "No"));
    }
}