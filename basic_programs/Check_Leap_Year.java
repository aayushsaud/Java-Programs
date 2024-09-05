import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}