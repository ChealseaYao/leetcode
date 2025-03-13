package stackAndqueue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;


    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();

    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
       while(stackOut.empty()){
           while(!stackIn.empty()){
               stackOut.push(stackIn.pop());
           }
       }
       return stackOut.pop();

    }

    public int peek() {
        while(stackOut.empty()){
            while(!stackIn.empty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.empty()&&stackOut.empty();

    }

}
