import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        linkedListPalindromeCheck();   // UC8
    }
    // UC8: Linked List Based Palindrome Checker
    public static void linkedListPalindromeCheck() {

        // Define input string
        String input = "level";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("UC8 Result");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
}


