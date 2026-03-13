import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long start1 = System.nanoTime();
        boolean result1 = stackStrategy.check(input);
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = dequeStrategy.check(input);
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;

        System.out.println("Input : " + input);

        System.out.println("Stack Strategy Result : " + result1);
        System.out.println("Execution Time (Stack) : " + duration1 + " ns");

        System.out.println();

        System.out.println("Deque Strategy Result : " + result2);
        System.out.println("Execution Time (Deque) : " + duration2 + " ns");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}