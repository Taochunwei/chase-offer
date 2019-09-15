/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */

import java.util.ArrayList;
/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<Integer> count=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Func(res,count,root,0,target);
        return res;
    }

    private void Func(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> count,TreeNode node ,int sum,int taget){
        sum+=node.val;
        count.add(node.val);
        if(node.left!=null){
            ArrayList<Integer> r=(ArrayList<Integer>) count.clone();
            Func(res,r,node.left,sum,taget);
        }
        if(node.right!=null){
            ArrayList<Integer> r=(ArrayList<Integer>) count.clone();
            Func(res, r, node.right, sum, taget);
        }
        if(node.left==null&&node.right==null){
            if(sum==taget)
                res.add((ArrayList<Integer>)count.clone());
        }

    }

}