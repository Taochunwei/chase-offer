/**
 * @author Taochunwei
 * @date 2019/9/5 - 7:47
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        boolean find=false;
        int colum=array[0].length-1;
        int row=0;
        while (row<array.length&&colum>=0){
            if(target==array[row][colum]){
                find=true;
                break;
            }
            else if(target>array[row][colum]){
                row++;
            }else //(target<array[row][colum])
            {
                colum--;
            }
        }
        return find;
    }
}
