import java.util.Scanner;

public class Sum_of_Elements_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size! Array size must be greater than 0.");
            scanner.close();
            return;
        }

        int[] array = new int[size];

        // Taking input for each element of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element of the array: ");
            array[i] = scanner.nextInt();
        }

       int sum = 0;

       // Looping through each element and adding them
       for (int i : array) {
           sum += i;
       }
        System.out.println("Sum of elements in the array is: " + sum);
        scanner.close();
    }
}