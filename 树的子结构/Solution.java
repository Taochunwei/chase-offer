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

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean reslut=false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val)
                reslut=compareSubtres(root1,root2);
            if(!reslut)
                reslut=HasSubtree(root1.left,root2);
            if(!reslut)
                reslut=HasSubtree(root1.right,root2);
        }
        return reslut;
    }

    private boolean compareSubtres(TreeNode root1,TreeNode root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val==root2.val){
            return compareSubtres(root1.left,root2.left)&&compareSubtres(root1.right,root2.right);
        }else return false;
    }
}
