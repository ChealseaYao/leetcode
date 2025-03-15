package stackAndqueue;

import java.util.Map;
import java.util.Stack;

public class evalRPN {
    public static void main(String[] args) {

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int num1 = stack.peek(); //由于栈的先进后出，先弹出是第二个操作数
                stack.pop();
                int num2 = stack.peek(); //这才是第一个操作数
                stack.pop();
                if (tokens[i].equals("+")) {
                    int num = num2 + num1;
                    stack.push(num);
                }
                if (tokens[i].equals("-")) {
                    int num = num2 - num1;
                    stack.push(num);
                }
                if (tokens[i].equals("*")) {
                    int num = num2 * num1;
                    stack.push(num);
                }
                if (tokens[i].equals("/")) {
                    if (num1 == 0) {
                        throw new ArithmeticException("Division by zero");
                    } else {
                        int num = num2 / num1;
                        stack.push(num);
                    }
                }
            } else {
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            }
        }
        return stack.pop();

    }
}
