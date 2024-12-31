// Time Complexity
// Best Case, Average Case, Worst Case: O(n²)

// Space Complexity
// O(n)

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
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

        selectionSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
    public static void selectionSort(int[] array, int start, int n) {
        if (start >= n - 1) return;

        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        if (minIndex != start) {
            int temp = array[start];
            array[start] = array[minIndex];
            array[minIndex] = temp;
        }

        selectionSort(array, start + 1, n);
    }
}