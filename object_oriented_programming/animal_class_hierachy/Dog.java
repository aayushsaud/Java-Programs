package object_oriented_programming.animal_class_hierachy;

// Dog class derived from Animal
public class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Method to make a dog-specific sound
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Method specific to Dog class
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    // Display additional information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}