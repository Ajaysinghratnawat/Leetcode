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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        int count=0;
		ListNode temp = head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
        int i=count-n+1;
		if(i==1){
            head=head.next;
            return head;
        }
        ListNode prev=head;
            int j=1;
            while(j<i-1) {
                prev=prev.next;
                j++;
		    }
		    prev.next=prev.next.next;
		return head;
    }
}