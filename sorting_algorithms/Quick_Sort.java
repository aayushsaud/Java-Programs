import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
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

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        scanner.close();
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partition = partition(array, low, high);
            quickSort(array, low, partition - 1);
            quickSort(array, partition + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (array[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (array[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
            }
        }
        swap(array, low, j);
        return j;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}