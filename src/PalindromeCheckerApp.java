import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        stackBasedPalindromeCheck();   // UC5
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


