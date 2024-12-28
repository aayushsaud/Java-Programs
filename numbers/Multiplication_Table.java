import java.util.Scanner;

public class Multiplication_Table {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Print the multiplication table of: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println("2 X " + i + " = " + product);
        }
        scanner.close();
   } 
}