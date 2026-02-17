// UseCase5PalindromeCheckerApp.java

import java.util.Stack;   // Import Stack class

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

        System.out.println("UC5: Stack-Based Palindrome Checker");
        System.out.println("=====================================");

        // Hardcoded string
        String original = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < original.length(); i++) {
            char poppedChar = stack.pop();
            if (original.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
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
