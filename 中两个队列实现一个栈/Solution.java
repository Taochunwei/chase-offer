/**
 * @author Taochunwei
 * @date 2019/9/5 - 16:04
 */
import java.util.Stack;
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.isEmpty())
            return stack2.pop();
        else//  (!stack1.isEmpty())
        {
            while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
