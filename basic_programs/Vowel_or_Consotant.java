import java.util.Scanner;

public class Vowel_or_Consotant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User inputs a character
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        // Convert to lowercase for case insensitivity
        letter = Character.toLowerCase(letter);

        // Checking if the character is a letter
        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is not a valid letter.");
        } else {
            // Checking if the character is a vowel or consonant
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        }
        scanner.close();
    }
}