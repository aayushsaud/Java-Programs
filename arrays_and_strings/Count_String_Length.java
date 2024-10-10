import java.util.Scanner;

public class Count_String_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for a string
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        
        int length = 0;

        // Iterating through each character in the string
        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("The length of the string is: " + length);

        scanner.close();
    }
}