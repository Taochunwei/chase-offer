/**
 * @author Taochunwei
 * @date 2019/9/6 - 10:43
 */
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int p1=0;
        int p2=array.length-1;
        int Midindex=p1;
        while (array[p1]>=array[p2]){
            if(p2-p1==1){
                Midindex=p2;
                break;
            }
            Midindex=(p1+p2)/2;
            if(array[p1]==array[Midindex]&&array[Midindex]==array[p2]){
                Midindex=find(array,p1,p2);
                break;
            }
            if(array[Midindex]>=array[p1]){
                p1=Midindex;
            }if(array[Midindex]<=array[p2]){
                p2=Midindex;
            }
        }
        return array[Midindex];
    }
    private int find(int[] array,int start,int end){
        int ret=start;
        for(int i=start+1;i<=end;i++){
            if(array[i]<array[ret])
                ret=i;
        }
        return ret;
    }
}
