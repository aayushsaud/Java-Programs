package object_oriented_programming.vehicle_class_hierarchy;

public class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car("Toyota", "Camry", 2020, 15000, 4, false);
        car.start();
        car.displayVehicleType();
        car.stop();

        System.out.println();

        // Creating a Bike object
        Bike bike = new Bike("Yamaha", "R15", 2018, 8000, 155, true);
        bike.start();
        bike.displayVehicleType();
        bike.stop();

        System.out.println();

        // Creating a Truck object
        Truck truck = new Truck("Volvo", "FMX", 2021, 50000, 18, 3);
        truck.start();
        truck.displayVehicleType();
        truck.stop();
    }
}