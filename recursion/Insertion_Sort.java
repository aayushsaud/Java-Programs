// Time Complexity
// Best Case: O(n) // When the iterative is already sorted
// Average Case, Worst Case: O(n²)

// Space Complexity
// O(n)

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

        insertionSort(array, 0, n);
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
    public static void insertionSort(int[] array, int i, int n) {
        if (i == n) return;

        int j = i;
        while (j > 0 && array[j - 1] > array[j]) {
            int temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
            j--;
        }

        insertionSort(array, i + 1, n);
    }
}