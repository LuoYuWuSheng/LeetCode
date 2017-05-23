package P144;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preTrival(root,result);
        return result;
    }

    public void preTrival(TreeNode node, List result){
        //竟然没有先判断当前数据的情况就直接使用，导致输入为空的时候出现null pointer的异常
        if(node != null){
            result.add(node.val);
            if(node.left != null)preTrival(node.left,result);
            if(node.right != null)preTrival(node.right,result);
        }
    }

    //test
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode child2 = new TreeNode(2);
        TreeNode child3 =  new TreeNode(3);
        root.left = null;
        root.right = child2;
        child2.left = child3;
        child2.right = null;
        child3.left = null;
        child3.right = null;
        Solution sol = new Solution();
        List<Integer> result = sol.preorderTraversal(root);
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%d ",result.get(i));
        }
    }
}