import java.util.Scanner;

public class Remove_White_Spaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for a string
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' ') 
                newString.append(ch);
        }

        System.out.println();
        System.out.println("Given String: " + string);
        System.out.println("String Without Spaces: " + newString);

        scanner.close();
    }    
}