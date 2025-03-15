package stackAndqueue;

import java.util.Stack;

public class removeDuplicates {
    public static void main(String[] args) {

    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() == 0 || s.charAt(i) != stack.peek()) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (stack.size() != 0) {
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();


    }
}
