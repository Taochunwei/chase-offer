/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length<=0)
            return false;
        if(sequence.length==1)
            return true;
        return VerifySquenceOfBST(sequence,0,sequence.length-1);
    }

    private boolean VerifySquenceOfBST(int[] sequence,int start, int end){
        if(start>=end)
            return true;
        int root=sequence[end];
        int i=start;
        for (; i <=end ; i++) {
            if(sequence[i]>root)
                break;
        }
        int j=i;
        for(;j<end;j++){
            if(sequence[j]<root)
                return false;
        }
        boolean left=true;
        if(i>start)
            left=VerifySquenceOfBST(sequence,start,i-1);
        boolean rigrht=true;
        if(i<end)
            rigrht=VerifySquenceOfBST(sequence,i,end-1);
        return left&&rigrht;
    }

    public static void main(String[] args) {
        int[] arr={7,4,6,5};
        Solution s=new Solution();
        System.out.println(s.VerifySquenceOfBST(arr));
    }
}