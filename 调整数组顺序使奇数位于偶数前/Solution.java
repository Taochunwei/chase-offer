/**
 * @author Taochunwei
 * @date 2019/9/9 - 11:52
 */
public class Solution {
    public void reOrderArray(int [] array) {
        for(int i=1;i<array.length;i++){
            if(array[i]%2==1){//如果奇数之前有偶数，就一直把奇数往前挪
                int j=i-1;
                int temp=array[i];
                while (j>=0&&(array[j]%2==0)){//核心代码
                    array[j+1]=array[j];
                    j--;
                }
                array[++j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Solution s =new Solution();
        int[] arr={1,2,3,4,5,6,7};
        s.reOrderArray(arr);
        System.out.println(arr.toString());
    }
}
