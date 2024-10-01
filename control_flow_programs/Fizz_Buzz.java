import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Printing Fizz-Buzz
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        scanner.close();
}