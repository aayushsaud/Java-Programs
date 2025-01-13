import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate_in_Unsorted_Array {
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

        HashSet<Integer> seen = new HashSet<>();

        int[] result = new int[array.length];
        int index = 0;

        for (int num : array) {
            if (!seen.contains(num)) { // If the number hasn't been seen
                seen.add(num);
                result[index++] = num; // Add to the result array
            }
        }

        int[] resultArray =  Arrays.copyOf(result, index);

        System.out.println(Arrays.toString(resultArray));
        scanner.close();
    }
}