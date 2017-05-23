package offer;

import java.util.Stack;

/**
 * Created by luoyu on 2017/3/21 0021.
 */
public class stackOutOrder {

    Stack<Integer> stack = new Stack();
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int popIndex = 0;
        for(int i =0;i< pushA.length;i++) {
            stack.push(pushA[i]);
            while(!stack.empty() && popIndex < popA.length && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        if(!stack.empty() || popIndex < popA.length)return false;
        else return true;
    }

    public static void main(String[] args) {
        stackOutOrder test = new stackOutOrder();
        int[] in = {1};
        int[] in2 = {1};
        test.IsPopOrder(in,in2);
    }
}
