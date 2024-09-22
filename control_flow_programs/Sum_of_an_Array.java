import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_an_Array {
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

        // Printing the given array
        System.out.println("Your Array: " + Arrays.toString(array));

        int sum = 0;
        // Adding up the elements in the array
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("The sum of the elements in your array is: " + sum);

        scanner.close();
    }
}