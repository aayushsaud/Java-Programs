import java.util.Scanner;
import java.util.Arrays;

public class Check_if_strings_are_anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Askinging the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Askinging the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Normalizaing the strings by removing spaces and converting to lowercase
        firstString = firstString.replaceAll("\\s", "").toLowerCase();
        secondString = secondString.replaceAll("\\s", "").toLowerCase();

        // Checking if lengths are the same
        if (firstString.length() != secondString.length()) {
            System.out.println("The given strings aren't anagrams!");
        } else {
            // Converting the strings to character arrays
            char[] firstArray = firstString.toCharArray();
            char[] secondArray = secondString.toCharArray();

            // Sorting the character arrays
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            // Comparing the sorted arrays
            if (Arrays.equals(firstArray, secondArray)) {
                System.out.println("The given strings are anagrams!");
            } else {
                System.out.println("The given strings aren't anagrams!");
            }
        }
        scanner.close();
    }
}