import java.util.Scanner;
import java.util.Stack;

public class Valid_Parenthesis_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();

        boolean isBalanced = validBrackets(string);

        if (isBalanced) {
            System.out.println(string + " is valid!");
        }
        else {
            System.out.println(string + " is not valid!");
        }
        scanner.close();
    }

    public static boolean validBrackets(String string) {
        Stack<Character> stack = new Stack<Character>();
    
        for (char ch : string.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char character = stack.pop();
                if (!((character == '(' && ch == ')') || 
                      (character == '{' && ch == '}') || 
                      (character == '[' && ch == ']'))) {
                    return false;
                }
            } else {
                continue;
            }
        }
    
        return stack.isEmpty();
    }    
}