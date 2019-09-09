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
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<1)
            return null;

        int i=1;
        ListNode p1=head;
        ListNode p2=head;
        while (i<k){
            if(p1.next!=null){
                p1=p1.next;
                i++;
            }
            else return null;
        }
        while (p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
