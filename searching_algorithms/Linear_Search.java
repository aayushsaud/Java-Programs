// Time Complexity
// Best Case: O(1)
// Average Case, Worst Case: O(n)

// Space Complexity
// O(1)

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
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

        System.out.print("Enter the number to search: ");
        int number = scanner.nextInt();

        scanner.close();

        int index = -1;

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == number) {
              index = i;
              break;
            }
        }

        if (index == -1) {
          System.out.println("Number not found.");
        }
        else {
          System.out.println("Given Array: " + Arrays.toString(array));
          System.out.println("Found the number at index: " + index);
        }
    }
}
