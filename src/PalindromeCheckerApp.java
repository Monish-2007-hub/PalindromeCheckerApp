public class PalindromeCheckerApp {

    public static void main(String[] args) {
        checkHardcodedPalindrome();  // UC2
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
        System.out.println("UC2");
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}


