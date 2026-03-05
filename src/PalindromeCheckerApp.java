import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        queueStackPalindromeCheck();   // UC6
    }
    // UC6: Queue + Stack Based Palindrome Check
    public static void queueStackPalindromeCheck() {

        // Define the input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("UC6 Result");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
}


