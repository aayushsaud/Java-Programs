package object_oriented_programming.animal_class_hierachy;

public class Main {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.makeSound();
        dog.fetch();

        System.out.println();

        // Creating a Cat object
        Cat cat = new Cat("Whiskers", 2, "Gray");
        cat.displayInfo();
        cat.makeSound();
        cat.purr();
    }
}