// UseCase3PalindromeCheckerApp.java

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

        System.out.println("UC3: Palindrome Check Using String Reverse");
        System.out.println("=====================================");

        // Hardcoded string
        String original = "madam";

        // Reverse string using loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended Successfully.");
        System.out.println("=====================================");
    }
}
