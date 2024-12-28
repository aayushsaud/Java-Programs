import java.util.Scanner;

public class Substring_of_String {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for a string
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();

        int length = string.length();

        // Outer loop picks the starting point
        for (int i = 0; i < length; i++) {
            // Inner loop picks the ending point
            for (int j = i + 1; j <= length; j++) {
                // Printing substring from i to j
                System.out.println(string.substring(i, j));
            }
        }
        scanner.close();
    }
}