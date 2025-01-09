import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Print_Duplicate_in_Array {
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

        // To store the elements already seen
        HashSet<Integer> seen = new HashSet<>();
        // To store the duplicates already printed
        HashSet<Integer> printed = new HashSet<>();

        System.out.println("Duplicates in the array:");
        for (int num : array) {
            if (seen.contains(num)) {
                // Print the duplicate only if it hasn't been printed yet
                if (!printed.contains(num)) {
                    System.out.println(num);
                    printed.add(num);
                }
            } else {
                seen.add(num);
            }
        }
        scanner.close();
    }
}