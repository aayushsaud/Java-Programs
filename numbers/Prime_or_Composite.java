import java.util.Scanner;

public class Prime_or_Composite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking if the number is prime or not
        if (num == 0 || num == 1){
            System.out.println(num + " is neither Prime nor Composite!");
        }
        else {
            int count = 0;
            for (int i = 1; i <= num; i++){
                if (num % i == 0) count ++;
            }
            if (count == 2) System.out.println(num + " is a Prime Number!");
            else System.out.println(num + " is a Composite Number!");
        }
        scanner.close();
    }
}

