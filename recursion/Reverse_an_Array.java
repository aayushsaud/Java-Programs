import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_Array {
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

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        System.out.println("Given Array: " + Arrays.toString(array));
        reverse(0, n, array);
        System.out.println("Reversed Array: " + Arrays.toString(array));

        scanner.close();
    }

    public static int[] reverse(int index, int length, int[] array) {
        if (index >= length / 2) {
            return array;
        }
        int temp = array[index];
        array[index] = array[length - 1 - index];
        array[length - 1 - index] = temp;

        return reverse(index + 1, length, array);
    }
}