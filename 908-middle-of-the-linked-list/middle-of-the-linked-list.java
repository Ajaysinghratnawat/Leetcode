/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p=head;
        ListNode n=head;
        if(head.next==null)return p;
        while(n.next!=null && n.next.next!=null){
            p=p.next;
            n=n.next.next;
            if(n.next==null ){
                return p;
            }
            else if(n.next.next==null){
                return p.next;
            }
        }
        return p.next;
    }
}