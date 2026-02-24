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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode prev = ans;
        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;
        for(int i=0;i<right-left;i++){
            ListNode temp2 = curr.next;
            curr.next = temp2.next;
            temp2.next = prev.next;
            prev.next = temp2;
        }
        return ans.next;
    }
}