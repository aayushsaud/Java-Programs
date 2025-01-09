import java.util.Scanner;

public class Prime_Numbers_Till_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a valid input (the given number neither Prime nor Composite)!");
            scanner.close();
            return;
        }        

        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}