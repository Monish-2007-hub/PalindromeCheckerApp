public class PalindromeCheckerApp {

    public static void main(String[] args) {
        characterArrayPalindromeCheck();   // UC4
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
}


