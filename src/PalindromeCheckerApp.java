public class PalindromeCheckerApp {

    public static void main(String[] args) {
        showWelcome();   // UC1
        checkHardcodedPalindrome();  // UC2
    }

    // UC1: Welcome Message
    public static void showWelcome() {
        // Display welcome message
        System.out.println("welcome to the Palindrome Checker Management System");

        // Display version
        System.out.println("Version: 1.0");

        // Continue to next use case (placeholder)
        System.out.println("System initialized successfully.");
    }

    // UC2: Hardcoded Palindrome Check
    public static void checkHardcodedPalindrome() {

        String input = "madam";   // Hardcoded string
        boolean isPalindrome = true;

        // Loop till half of the string
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}


