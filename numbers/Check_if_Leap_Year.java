import java.util.Scanner;

public class Check_if_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Checking if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}