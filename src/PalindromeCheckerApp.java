import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        showWelcome();   // UC1
        checkHardcodedPalindrome();  // UC2
        reverseBasedPalindromeCheck(); // UC3
        characterArrayPalindromeCheck();   // UC4
        stackBasedPalindromeCheck();   // UC5
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

    // UC3: Reverse String Based Palindrome Check
    public static void reverseBasedPalindromeCheck() {

        String input = "madam";
        String reversed = "";

        // Reverse using loop (as per your hint)
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("UC3 Result");
        System.out.println("Input text: " + input);

        if (input.equals(reversed)) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }

        System.out.println();
    }

    // UC4: Character Array Based Palindrome Check
    public static void characterArrayPalindromeCheck() {

        // Declare and initialize input string
        String input = "radar";

        // Convert string into character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters using two-pointer approach
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
    // UC5: Stack-Based Palindrome Check
    public static void stackBasedPalindromeCheck() {

        // Declare input
        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Pop and compare
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("UC5 Result");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
}


