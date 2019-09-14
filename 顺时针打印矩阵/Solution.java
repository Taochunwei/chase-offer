/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int up=0;                   int left=0;
        int down=matrix.length-1;     int right=matrix[0].length-1;
        while (up<=down&&left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[up][i]);
            }
            up++;
            for (int i=up;i<=down;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(up-1!=down) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[down][i]);
                }
                down--;
            }
            if(right+1!=left) {
                for (int i = down; i >= up; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}