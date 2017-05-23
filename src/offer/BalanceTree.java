package offer;

import offer.base.TreeNode;

/**
 * Created by luoyu on 2017/4/11 0011.
 * 犯的错误，不应该返回high，而应该返回左右中教大的。
 */
public class BalanceTree {
    boolean result = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        travel(root);
        return result;
    }
    private int travel(TreeNode root){
        int left = 0;
        int right = 0;
        if(root != null){
            left += travel(root.left)+1;
            right += travel(root.right)+1;
        }
        else return 0;
        int high = Math.abs(left-right);
        if(high > 1){
            this.result = false;
        }
        if(left > right)return left;
        else return right;
    }
}
