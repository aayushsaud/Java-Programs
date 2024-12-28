package sorting_algorithms;
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

        // Bubble Sort algorithm
        for (int i = n - 1; i >= 1; i--) {
            boolean swapped = false;

            // Inner loop: compares adjacent elements up to the current boundary (i)
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps were made during this pass, the array is already sorted
            if (!swapped) break;
        }
        System.out.println("Sorted array: " + Arrays.toString(array));

        scanner.close();
    }
}