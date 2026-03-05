import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        dequePalindromeCheck();   // UC7
    }
    // UC7: Deque Based Optimized Palindrome Checker
    public static void dequePalindromeCheck() {

        // Define input string
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("UC7 Result");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
}


