package offer;

import offer.base.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by luoyu on 2017/3/23 0023.
 */
public class TreeFindTarPath {
//    private Stack<Integer> stack = new Stack();
    int target;
    ArrayList<ArrayList<Integer>> result = new ArrayList();
    Stack<TreeNode> stack = new Stack();
    int sum = 0;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        this.target = target;
        return result;
    }
//  用栈没有写出来。。。
    public void deepStackTravel(TreeNode root){
        if(root != null){
            stack.push(root);
            while(!stack.empty()){
                TreeNode temp = stack.peek();
                sum += temp.val;
                if(sum == target)print();
                if(temp.left != null)stack.push(temp.left);
                if(temp.right != null)stack.push(temp.right);
                sum-=temp.val;
                stack.pop();
            }
        }
    }
//    递归
    public void deepTravel(TreeNode root){
        if(root != null){
            stack.push(root);
            sum += root.val;
            if(root.left == null && root.right == null && sum == target)print();
            deepTravel(root.left);
            deepTravel(root.right);
            sum -= root.val;
            stack.pop();
        }
    }
    public void print(){
        ArrayList<Integer> temp = new ArrayList<>();
        for (TreeNode node:stack) {
            temp.add(node.val);
        }
        result.add(temp);
    }
}
