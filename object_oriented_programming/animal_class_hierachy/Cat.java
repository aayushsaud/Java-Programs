package object_oriented_programming.animal_class_hierachy;

// Cat class derived from Animal
public class Cat extends Animal {
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Method to make a cat-specific sound
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    // Method specific to Cat class
    public void purr() {
        System.out.println(name + " is purring contentedly.");
    }

    // Display additional information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}