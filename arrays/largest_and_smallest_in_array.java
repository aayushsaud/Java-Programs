import java.util.Arrays;
import java.util.Scanner;

public class Largest_and_Smallest_in_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size. Please enter a positive integer.");
            scanner.close();
            return;
        }

        int[] array = new int[size];

        // Taking input for each element of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nYour Array: " + Arrays.toString(array) + "\n");

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // Finding the smallest and largest numbers
        for (int number : array) { // Start from index 1
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
        }

        System.out.println("The smallest number in your array is: " + smallest);
        System.out.println("The largest number in your array is: " + largest);

        scanner.close();
    }
}