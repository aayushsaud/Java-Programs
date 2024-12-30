// Time Complexity
// Best Case, Average Case, Worst Case: O(n²)

// Space Complexity
// O(1)

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

        // Selection Sort algorithm
        for (int i = 0; i <= n - 2; i++) {
            int min = i; // Assuming the current index has the smallest element
            
            // Inner loop finds the smallest element in the unsorted part of the array
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // Swapping the smallest element found with the element at the current position
            if (min != i) { // Only swapping if a smaller element is found
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));

        scanner.close();
    }
}