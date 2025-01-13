import java.util.Scanner;

public class Second_Smallest_Element_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Taking input for each element of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array[i] = scanner.nextInt();
        }

	    int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            }
            else if (number != smallest && number < secondSmallest) {
                secondSmallest = number;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found!");
        }
        else {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        }
        scanner.close();
    }
}