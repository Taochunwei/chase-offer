/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        if(root.left!=null&&root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
        }else if (root.left!=null&&root.right==null){
            root.right=root.left;
            root.left=null;
            Mirror(root.right);
        }else if(root.left==null&&root.right!=null)
        {
            root.left=root.right;
            root.right=null;
            Mirror(root.left);
        }else return;
    }
}
