/**
 * @author Taochunwei
 * @date 2019/9/6 - 10:43
 */
public class Solution {
    public int cutRope(int target) {
        if(target<2)
            return 0;
        if(target==2)
            return 1;
        if(target==3)
            return 2;
        int[] product = new int[target + 1];
        product[0]=0;
        product[1]=1;
        product[2]=2;
        product[3]=3;
        for (int i=4;i<=target;i++){
            int max=0;
            for(int j=1;j<=i/2;j++){
                int prod=product[j]*product[i-j];
                if(prod>max)
                    max=prod;
                product[i]=max;
            }
        }
        return product[target];
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.cutRope(8));
    }
}