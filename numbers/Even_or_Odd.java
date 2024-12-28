import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking if the number is even or odd
        String value = "";
        if (num % 2 == 0) value = "even";
        else value = "odd";

        // Printing the output
        System.out.println(num + " is: " + value);

        scanner.close();
    }
}