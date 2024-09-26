import java.util.Scanner;

public class Reverse_an_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a string to reverse: ");
        String string = scanner.nextLine();

        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString = reversedString + string.charAt(i);
        }
        System.out.println("Your String: " + string);
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}
