import java.util.HashSet;
import java.util.Scanner;

public class Common_Elements_Between_Two_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the size of first array
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        // Taking input for each element of the array
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array1[i] = scanner.nextInt();
        }

        // Asking the user for the size of second array
        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        // Taking input for each element of the array
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array2[i] = scanner.nextInt();
        }

        printCommonElements(array1, array2);
        scanner.close();
    }

    public static void printCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        // Checking common elements
        System.out.println("Common elements:");
        for (int num : array2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                // Removing the element to prevent duplicates
                set.remove(num);
            }
        }
    }
}