/**
 * @author Taochunwei
 * @date 2019/9/9 - 11:52
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode newhead=ReverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
}
