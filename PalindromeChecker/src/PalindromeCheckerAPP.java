// UseCase2PalindromeCheckerApp.java

// Class declaration
public class PalindromeCheckerAPP {

    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";
    static final int RANO = 954;
    static final String Name = "Rannadeer kumar seetha";

    // Main method – Entry point
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("=====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("This app has been developed by " + Name + " " + RANO);
        System.out.println("=====================================");

        System.out.println("This application checks whether a given string is a palindrome.");
        System.out.println("UC2 Implementation Started.");
        System.out.println("=====================================");

        // Hardcoded string
        String word = "madam";

        // Reverse logic
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Palindrome check using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended Successfully.");
        System.out.println("=====================================");
    }
}
