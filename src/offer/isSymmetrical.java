package offer;

import offer.base.TreeNode;

/**
 * Computer user luoyu
 * Created by 张洋 on 23/8/17.
 */
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        travel(pRoot,pRoot);
        return result;
    }

    public boolean result = true;

    public void travel(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            if(left.left.val==right.right.val
                    && left.right.val==right.left.val){
                travel(left.left,right.right);
                travel(left.right,right.left);
            }
        } else if (left != right) result = false;
    }
}
