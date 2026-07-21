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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode temp=head;
       for(int i=1;i<k;i++){
        temp=temp.next;
       }
       ListNode slow=head;
       ListNode fast=temp;
       while(fast.next!=null){
        fast=fast.next;
        slow=slow.next;
       }
       int ans=temp.val;
       temp.val=slow.val;
       slow.val=ans;
       return head;
    }
}