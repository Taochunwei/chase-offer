/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean ret=false;
        Stack<Integer> stack=new Stack<Integer>();
        int pop=0;
        for (int i = 0; i <pushA.length ; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty()&&stack.peek()==popA[pop]){
                stack.pop();
                pop++;
            }
        }
        return stack.isEmpty()&&pop==popA.length;
    }
}