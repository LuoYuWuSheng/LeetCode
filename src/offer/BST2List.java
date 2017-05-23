package offer;

import offer.base.TreeNode;

/**
 * Created by luoyu on 2017/3/25 0025.
 */
public class BST2List {
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode root = list(pRootOfTree);
//        忽略了输入为null的情况
        if(pRootOfTree == null)return null;
        while(root.left != null)root = root.left;
        return root;
    }
    public TreeNode list(TreeNode root){
        if(root != null){
            list(root.left);
            list(root.right);
            if(root.left != null){
                while(root.left.right != null)root.left = root.left.right;
                root.left.right = root;
            }
            if(root.right != null){
                while(root.right.left != null)root.right = root.right.left;
                root.right.left = root;
            }
        }
        return root;
    }
}
