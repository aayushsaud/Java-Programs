import java.util.Scanner;

public class Check_if_Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        int numDigits = input.length();
        int sum = 0;
        
        // Extracting the digits from the number
        for (int i = 0; i <= input.length() - 1; i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            sum += Math.pow(digit, numDigits); 
        }

        int inputInt = Integer.valueOf(input);

        if (inputInt == sum) System.out.println(input + " is an Armstrong Number!");
        else System.out.println(input + " is not an Armstrong Number!");

        scanner.close();
    }
}
