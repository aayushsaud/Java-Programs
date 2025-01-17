import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the size of first array
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();

        int[] firstArray = new int[size1];

        // Taking input for each element of the array
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            firstArray[i] = scanner.nextInt();
        }

        // Asking the user for the size of second array
        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();

        int[] secondArray = new int[size2];

        // Taking input for each element of the array
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            secondArray[i] = scanner.nextInt();
        }

        int n = firstArray.length;
        int m = secondArray.length;

        int[] mergedArray = new int[n + m];

        int leftIndex = 0;
        int rightIndex = 0;

        int newIndex = 0;

        while (leftIndex < n && rightIndex < m) {
            if (firstArray[leftIndex] < secondArray[rightIndex]) {
                mergedArray[newIndex++] = firstArray[leftIndex++];
            }
            else {
                mergedArray[newIndex++] = secondArray[rightIndex++];
            }
        }

        while (leftIndex < n) {
            mergedArray[newIndex++] = firstArray[leftIndex++];
        }

        while (rightIndex < m) {
            mergedArray[newIndex++] = secondArray[rightIndex++];
        }

        System.out.println(Arrays.toString(mergedArray));
        scanner.close();
    }
}