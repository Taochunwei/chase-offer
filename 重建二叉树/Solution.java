/**
 * @author Taochunwei
 * @date 2019/9/5 - 8:50
 */
/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */

public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in==null || pre.length<=0 || in.length<=0){//数组或数组名非法
            return null;
        }
        TreeNode root=new TreeNode(pre[0]);
        return reConstructBinaryTree(root,pre,in,0,pre.length-1,0,in.length-1);
    }
//[start....end]
    private TreeNode reConstructBinaryTree(TreeNode node,int[] pre,int[] in,int startpre,int endpre,int startin,int endin){
        node=new TreeNode(pre[startpre]);
        if(startin==endin)
            return node;
        int indexofhead_in=find(pre[startpre],startin,endin,in);
        int leftlenght=indexofhead_in-startin;
        int rightlenght=endin-indexofhead_in;
        if(leftlenght>0) {
            node.left = reConstructBinaryTree(node.left, pre, in, startpre + 1, startpre + leftlenght, startin, indexofhead_in - 1);
        }
        if (rightlenght>0) {
            node.right = reConstructBinaryTree(node.right, pre, in, startpre + 1 + leftlenght, endpre, indexofhead_in + 1, endin);
        }
        return node;
    }
    private int find(int index,int start,int end,int[] in){
        for (int i=start;i<=end;i++){
            if(in[i]==index)
                return i;
        }
        return -1;
    }
}
