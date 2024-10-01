import java.util.Scanner;

public class Vowels_and_Consonants_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter a string
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        // Handling case sensitivity
        string = string.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            // Checking if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("There are " + vowelCount + " vowels in the string.");
        System.out.println("There are " + consonantCount + " consonants in the string.");

        scanner.close();
    }
}