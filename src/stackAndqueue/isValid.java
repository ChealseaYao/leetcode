package stackAndqueue;

import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(')');
            } else if (arr[i] == '[') {
                stack.push(']');
            } else if (arr[i] == '{') {
                stack.push('}');
            }
            if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
                if (stack.empty() || arr[i] != stack.pop()) {
                    return false;
                }
            }

        }
        return stack.empty();

    }
}
