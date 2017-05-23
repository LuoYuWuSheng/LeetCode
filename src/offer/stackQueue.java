package offer;

import java.util.Stack;

/**
 * Created by luoyu on 2017/2/7 0007.
 */
public class stackQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.empty())return stack2.pop();
        else {
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
