// Time Complexity
// Best Case: O(n) // When the iterative is already sorted
// Average Case, Worst Case: O(n²)

// Space Complexity
// O(1)

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];

        // Adding elements in the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array[i] = scanner.nextInt();
        }

       // Insertion sort algorithm
        for (int i = 1; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) { // Comparing the current element with the previous one
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));

        scanner.close();
    }
}