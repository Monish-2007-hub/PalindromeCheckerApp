public class PalindromeCheckerApp {

    public static void main(String[] args) {
        recursivePalindromeCheck();   // UC9
    }
    // UC9: Recursive Palindrome Checker
    public static void recursivePalindromeCheck() {

        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("UC9 Result");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println();
    }
    // Recursive function to check palindrome
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters mismatch
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}


