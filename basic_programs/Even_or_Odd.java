import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is even or odd
        String value = "";
        if (num % 2 == 0) value = "even";
        else value = "odd";

        // Print the output
        System.out.println(num + " is: " + value);
    }
}