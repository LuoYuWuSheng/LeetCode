package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

/**
 * Created by luoyu on 2017/3/21 0021.
 */
public class printTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    Queue<TreeNode> queue = new LinkedList();
    Stack<TreeNode> stack = new Stack();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList();
        if(root != null){
            while(queue.peek()!=null){
                TreeNode temp = queue.poll();
                if(temp.right != null)queue.add(temp.right);
                if(temp.left != null)queue.add(temp.left);
                stack.push(temp);
            }
        }
        while(!stack.empty()){
            result.add(stack.pop().val);
        }
        return result;
    }
}
