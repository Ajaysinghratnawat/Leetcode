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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode i = l1;
        ListNode j = l2;
        ListNode ans = new ListNode(Integer.MAX_VALUE,null);
        ListNode prev = ans;
        int carry=0;
        while(i!=null || j!=null){
            int temp1=0,temp2=0;
            if(i!=null)
                temp1=i.val;
            if(j!=null)
                temp2=j.val;
            int temp = temp1+temp2+carry;
            carry=temp/10;
            ListNode temp3 = new ListNode();
            temp3.val=temp%10;
            temp3.next=null;
            if(ans.val==Integer.MAX_VALUE)
            {
                ans=temp3;
                prev=ans;
            }
            else
            {
                prev.next=temp3;
                prev=prev.next;
            }
            if(i!=null)
                i=i.next;
            if(j!=null)
                j=j.next;
        }
        if(carry!=0) {
            ListNode temp4 = new ListNode();
            temp4.val = carry;
            temp4.next=null;
            prev.next=temp4;
            prev=prev.next;
        }
        return ans;
    }
}