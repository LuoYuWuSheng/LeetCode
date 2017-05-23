package offer;

/*
 * Created by luoyu on 2017/2/7 0007.
 */
public class ReconstructTreeNode {

    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode node = new TreeNode(pre[0]);
        setLeft(node);
        setRight(node);
        return null;
    }

    private void setLeft(TreeNode root){

    }

    private void setRight(TreeNode root){}

//  add head and to to small the search array,when target equal root ignored and return -1
    private int leftOrRight(int[] in,int head,int end,int rootIndex,int target){
        for (int i = head; i <= end; i++) {
            if(in[i] == target && i < rootIndex)return -1;
            else return 1;
        }
        return 0;
    }
}
