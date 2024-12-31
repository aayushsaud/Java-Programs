// Time Complexity
// Best Case: O(n) // When the iterative is already sorted
// Average Case, Worst Case: O(n²)

// Space Complexity
// O(n)

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
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

        bubbleSort(array, array.length);
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
    public static void bubbleSort(int[] array, int n) {
        if (n == 1) return;

        boolean swapped = false;
        for (int j = 0; j <= n - 2; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                swapped = true;
            }
        }

        if (!swapped) return;
        bubbleSort(array, n - 1);
    }
}