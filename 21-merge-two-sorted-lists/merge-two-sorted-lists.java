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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        ListNode i = list1;
        ListNode j = list2;
        ListNode ans = new ListNode(101);
        ListNode prev=ans;
        while(i!=null && j!=null){
            int temp1=101,temp2=101;
            if(i!=null) temp1=i.val;
            if(j!=null) temp2=j.val;
            ListNode temp3 = new ListNode();
            if(temp1<=temp2) {
                temp3.val=temp1;
                temp3.next=null;
                if(ans.val==101)
                {
                    ans=temp3;
                    prev=temp3;
                }
                else
                {
                    prev.next=temp3;
                    prev=prev.next;
                }
               
                if(i!=null) i=i.next;
            }
            else{
                temp3.val=temp2;
                temp3.next=null;
                if(ans.val==101)
                {
                    ans=temp3;
                    prev=temp3;
                }
                else
                {
                    prev.next=temp3;
                    prev=prev.next;
                }
                if(j!=null) j=j.next;
            }
        }
        while(i!=null){
            ListNode temp = new ListNode();
            temp.val=i.val;
            temp.next=null;
            if(ans.val==101)
                {
                    ans=temp;
                    prev=temp;
                }
                else
                {
                    prev.next=temp;
                    prev=prev.next;
                }
            
            i=i.next;
        }
        while(j!=null){
            ListNode temp = new ListNode();
            temp.val=j.val;
            temp.next=null;
            if(ans.val==101)
                {
                    ans=temp;
                    prev=temp;
                }
                else
                {
                    prev.next=temp;
                    prev=prev.next;
                }
            j=j.next;
        }

        return ans;
    }
}