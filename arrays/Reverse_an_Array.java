import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_Array {
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

        int[] arrayReversed = new int[size];

        int j = 0;

        // Reversing an Array
        for (int i = size - 1; i >= 0; i--) {
            arrayReversed[j] = array[i];
            j++;
        }

        System.out.println("Your Array: " + Arrays.toString(array));
        System.out.println("Reversed Array: " + Arrays.toString(arrayReversed));
        scanner.close();
    }
}
