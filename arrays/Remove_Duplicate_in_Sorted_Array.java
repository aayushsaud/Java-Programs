import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate_in_Sorted_Array {
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

        System.out.println("Original Array: " + Arrays.toString(array));

        int newLength = removeDuplicates(array);

        System.out.println("Array Without Duplicates: " + Arrays.toString(Arrays.copyOf(array, newLength)));

        scanner.close();
    }

    public static int removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < array.length; j++) {
            if (array[i] != array[j]) {
                i++;
                array[i] = array[j];
            }
        }

        return i + 1;
    }
}