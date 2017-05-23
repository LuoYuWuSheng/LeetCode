package offer;

import java.util.Stack;

/**
 * Created by luoyu on 2017/3/21 0021.
 */
public class myStack {
    public static Stack<Integer> mystack = new Stack();
    public void push(int node) {
        mystack.push(node);
    }

    public void pop() {
        mystack.pop();
    }

    public int top() {
        return mystack.peek();
    }

    public int min() {
        int min = top();
        Stack<Integer> temp = new Stack();
        while(!mystack.empty()){
            if(top()<min)min = top();
            temp.push(top());
            pop();
        }
        while (!temp.empty()){
            mystack.push(temp.pop());
        }
        return min;
    }
}
