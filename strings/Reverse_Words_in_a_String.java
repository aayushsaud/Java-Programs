import java.util.Scanner;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Asking user to enter a string
       System.out.print("Enter a String: ");
       String string = scanner.nextLine();
       
       String[] array = string.split(" ");

       StringBuilder reversedString = new StringBuilder();

       for ( int i = array.length - 1; i >= 0; i--) {
           reversedString.append(array[i]);
           if (i > 0) {
               reversedString.append(" ");
           }
       }
       System.out.println(reversedString);
       scanner.close();
    }
}