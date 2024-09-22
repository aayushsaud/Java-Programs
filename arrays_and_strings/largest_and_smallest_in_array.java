import java.util.Arrays;
import java.util.Scanner;

public class largest_and_smallest_in_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Taking input for each element of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array[i] = scanner.nextInt();
        }

        System.out.println();

        // Printing the given array
        System.out.println("Your Array: " + Arrays.toString(array));

        System.out.println();

        int smallest = array[0];
        int largest = array[0];
        
        // Adding up the elements in the array
        for (int i = 0; i < size; i++) {
            if (array[i] < smallest) smallest = array[i];
            if (array[i] > largest) largest = array[i];
        }
        System.out.println("The smallest number in your array is: " + smallest);
        System.out.println("The largest number in your array is: " + largest);

        scanner.close();
    }
}
