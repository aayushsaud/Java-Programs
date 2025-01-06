// Time Complexity
// Best Case: O(1)
// Average Case, Worst Case: O(n)

// Space Complexity
// O(n)

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
        int index = linearSearch(array, number, 0);

        if (index == -1) {
          System.out.println("Number not found.");
        }
        else {
          System.out.println("Found the number at index: " + index);
        }
        scanner.close();
    }
    public static int linearSearch(int[] array, int number, int index) {
        if (index >= array.length) {
          return -1;
        }
        if (array[index] == number) {
          return index;
        }
        return linearSearch(array, number, index + 1);
    }
}