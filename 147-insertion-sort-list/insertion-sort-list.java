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
    public ListNode insertionSortList(ListNode head) {
        if(head==null){
            return head;
        }
        boolean swapped;
        do{
            swapped =false;
        
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val>temp.next.val){
                int ans=temp.val;
                temp.val=temp.next.val;
                temp.next.val=ans;
                swapped=true;
            }
            temp=temp.next;
        }
        }
        while(swapped);
        return head;
    
}
}