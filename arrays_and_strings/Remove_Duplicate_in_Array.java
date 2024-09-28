import java.util.Scanner;
import java.util.Arrays;

public class Remove_Duplicate_in_Array {
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

        int[] newArray = new int[size];
        int uniqueIndex = 0;

        // Removing duplicates from the array
        for (int i = 0; i < size; i++) {
            boolean exists = false;
            // Checking if the element already exists in newArray
            for (int j = 0; j < uniqueIndex; j++) {
                if (newArray[j] == array[i]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                newArray[uniqueIndex] = array[i];
                uniqueIndex++;
            }
        }

        // Creating a properly sized array with only the unique elements
        int[] resultArray = Arrays.copyOf(newArray, uniqueIndex);

        System.out.println("Array without duplicates: " + Arrays.toString(resultArray));

        scanner.close();
    }
}