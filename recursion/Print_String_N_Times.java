import java.util.Scanner;

public class Print_String_N_Times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();

        // Prompting the user for the number of times to print the string
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        NamePrinter(string, number);

        scanner.close();
    }

    public static void NamePrinter(String string, int count) {
        if (count <= 0) return;
        System.out.println(string);
        NamePrinter(string, count - 1);
    }
}
