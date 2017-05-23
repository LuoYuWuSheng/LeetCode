package offer;

/**
 * Created by luoyu on 2017/3/16 0016.
 */
public class ReConstructBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    int[] pre;
    int[] in;

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        this.pre = pre;
        this.in = in;
        TreeNode root = null;
        if (pre.length > 0) {
            root = construct(0, in.length - 1,0,pre.length);
        }
        return root;
    }

    private TreeNode construct(int startIn, int endIn,int startPre,int endPre) {
        TreeNode result = null;
        if( startIn > endIn || startPre > endPre)return null;
        result = new TreeNode(pre[startPre]);
        int tmp = startIn;
        while (tmp <= endIn){
            if(in[tmp] == pre[startPre]){
                result.left = construct(startIn,tmp-1,startPre+1,endPre);
                result.right = construct(tmp+1,endIn,startPre+tmp-startIn+1,endPre);
                break;
            } else tmp++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        ReConstructBinaryTree solve = new ReConstructBinaryTree();
        solve.reConstructBinaryTree(pre, in);
    }

}
