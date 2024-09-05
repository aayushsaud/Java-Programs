import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int[] numbers = {num1, num2, num3};

        // Finding the largest number
        int num = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > num) num = numbers[i];
        }

        // Printing the output
        System.out.println(num + " is the largest among " + num1 + ", "  + num2 + ", " + "and " + num3);

        scanner.close();
    }    
}
