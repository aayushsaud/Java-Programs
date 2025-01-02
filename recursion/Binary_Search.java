// Time Complexity
// Best Case: O(1)
// Average Case, Worst Case: O(log n)

// Space Complexity
// O(log n)

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }
        
        int[] array = new int[n];

        // Adding elements in the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array); // If the array is not sorted already

        System.out.print("Enter the number to search: ");
        int number = scanner.nextInt();

        int low = 0;
        int high = array.length - 1;
        int index = binarySearch(array, number, low, high);

        if (index == -1) {
          System.out.println("Number not found.");
        }
        else {
          System.out.println("Found the number at index: " + index);
        }

        scanner.close();
    }

    public static int binarySearch(int[] array, int number, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (array[mid] == number) {
          return mid;
        }
        else if (array[mid] < number) {
          low = mid + 1;
        }
        else {
          high = mid - 1;
        }

        return binarySearch(array, number, low, high);
    }
}