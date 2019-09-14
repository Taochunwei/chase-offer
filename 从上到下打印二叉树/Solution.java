/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return arr;
        q.add(root);
        while (!q.isEmpty()){
            TreeNode node=q.remove();
            if(node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);
            arr.add(node.val);
        }
        return arr;
    }
}