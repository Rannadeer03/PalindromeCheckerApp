// UseCase4PalindromeCheckerApp.java

// Class declaration
public class PalindromeCheckerAPP {

    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";
    static final int RANO = 954;
    static final String Name = "Rannadeer kumar seetha";

    // Main method – Entry point
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("Developed by " + Name + " " + RANO);
        System.out.println("=====================================");

        System.out.println("UC4: Character Array Based Palindrome Check");
        System.out.println("=====================================");

        // Hardcoded string
        String original = "madam";

        // Convert string to character array
        char[] characters = original.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input String: " + original);

        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended Successfully.");
        System.out.println("=====================================");
    }
}
