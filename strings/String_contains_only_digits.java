import java.util.Scanner;

public class String_contains_only_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for a string
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        boolean isOnlyDigits = true;
        
        // Iterating over each character of the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                isOnlyDigits = false;
                break;
            }
        }
        
        if (isOnlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
        
        scanner.close(); 
    }
}
