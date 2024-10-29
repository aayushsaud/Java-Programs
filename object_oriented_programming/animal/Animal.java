package object_oriented_programming.animal;

// Superclass for all animals
public class Animal {
    public String name;
    public int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make a sound (to be overridden by subclasses)
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // Method to display animal details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}