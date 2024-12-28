import java.util.Scanner;

public class Lowercase_and_Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String string = scanner.nextLine();

        System.out.println("String in Uppercase: " + string.toUpperCase());
        System.out.println("String in lowercase: " + string.toLowerCase());

        scanner.close();
    }
}