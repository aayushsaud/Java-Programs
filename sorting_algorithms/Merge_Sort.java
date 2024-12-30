import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {
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

        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        scanner.close();
    }

    public static void mergeSort(int array[], int low, int high) {
        if (low == high) return;
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int i = 0;

        while (left <= mid && right <= high) {
          if (array[left] <= array[right]) {
            temp[i++] = array[left++];
            }
          else temp[i++] = array[right++];
        }

        while (left <= mid) {
	        temp[i++] = array[left++];
        }
        
        while (right <= high) {
	        temp[i++] = array[right++];
        }

        for (int j = low; j <= high; j++) {
            array[j] = temp[j - low];
        }
    }
}
