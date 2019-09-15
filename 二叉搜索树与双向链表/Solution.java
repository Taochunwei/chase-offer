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

    TreeNode last=null;//全局变量记录链表尾节点
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode node =pRootOfTree;
        if(node==null)
            return null;
        if(node!=null){
            if(node.left!=null) Convert(node.left);
            node.left=last;
            if(last!=null)
                last.right=node;
            last=node;
            if(node.right!=null) Convert(node.right);
        }
        TreeNode head=last;
        while (head.left!=null)
            head=head.left;
        return head;
    }
}