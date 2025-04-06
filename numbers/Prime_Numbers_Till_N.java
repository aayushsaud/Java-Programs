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
            boolean isPrime = true;
            
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }
            
            if (isPrime) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}