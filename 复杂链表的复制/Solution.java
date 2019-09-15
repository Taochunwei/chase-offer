/**
 * @author Taochunwei
 * @date 2019/9/13 - 11:35
 */

public class Solution {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null)
            return null;

        RandomListNode curr=pHead;
        while (curr!=null){
            RandomListNode nodeClone=new RandomListNode(curr.label);
            nodeClone.next=curr.next;
            curr.next=nodeClone;
            curr=nodeClone.next;
        }

        curr=pHead;
        while (curr!=null){
            RandomListNode pClone=curr.next;
            if(curr.random!=null){
                pClone.random=curr.random.next;
            }
            curr=pClone.next;
        }

        curr=pHead;
        RandomListNode pCloneHead=curr.next;
        RandomListNode pClonecurr=pCloneHead;
        curr.next=pClonecurr.next;
        curr=pClonecurr.next;
        while (curr!=null){
            pClonecurr.next=curr.next;
            pClonecurr=pClonecurr.next;
            curr.next=pClonecurr.next;
            curr=curr.next;
        }
        return pCloneHead;
    }
}