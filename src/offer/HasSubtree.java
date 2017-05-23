package offer;


/**
 * Created by luoyu on 2017/2/9 0009.
 */
//todo 借助于KML算法，这个应该可以有改进算法的
//    run 了5次才过。题一旦麻烦起来就不好调试。如果在线笔试也是这样还不知道测试用例就麻烦了。
public class HasSubtree {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.right = new TreeNode(7);
        TreeNode left = new TreeNode(8);
        root.left = left;
        left.left = new TreeNode(9);
        TreeNode lr = new TreeNode(2);
        left.right = lr;
        lr.left = new TreeNode(4);
        lr.right = new TreeNode(7);

        TreeNode child = new TreeNode(8);
        child.left = new TreeNode(9);
        child.right = new TreeNode(2);

        HasSubtree hs = new HasSubtree();
        System.out.println(hs.HasSubtree(root,child));
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        return travel(root1,root2);
    }
//    逐一比较子树和当前的树根
    private boolean jugeSub(TreeNode father,TreeNode son){
        boolean result = true;
        if(father != null && son != null){
            if(father.val == son.val){
                if(!jugeSub(father.left,son.left))return false;
                else if(!jugeSub(father.right,son.right))return false;
                else result = true;
            }else return false;
        }else if(son == null)result = true;
        else result = false;
        return result;
    }

    private boolean travel(TreeNode root,TreeNode subTree){
        boolean result = false;
        if(root != null && subTree !=null){
            if(root.val == subTree.val)result = jugeSub(root,subTree);
//          为真立即返回
            if(result)return result;
            if (travel(root.left,subTree))return true;
            if (travel(root.right,subTree))return true;
        }else if(subTree ==null && root != null) return false;
        return result;
    }
}