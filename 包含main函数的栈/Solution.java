/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */
import java.util.Stack;

public class Solution {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stackMin=new Stack<>();
    public void push(int node) {
        stack.push(node);
        if(stackMin.isEmpty()){
            stackMin.push(node);
        }else {
            if(node<stackMin.peek())
                stackMin.push(node);
            else stackMin.push(stackMin.peek());
        }
    }

    public void pop() {
        if(!stack.isEmpty())
            stack.pop();
        if(!stackMin.isEmpty())
            stackMin.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}