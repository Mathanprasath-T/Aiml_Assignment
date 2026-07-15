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
        ListNode slow=head;

         ListNode fast=head;
        //Node result;
        while( fast!=null && fast.next!=null){
           // count++;
            slow=slow.next;
            fast=fast.next.next;
            // if(fast==null){
            //     head=slow;
            // }
        }
        
        // while(count!=0){
        // if(count%2==0){
        //     count=(count/2)+1;
        //     head=current;
        //     head=head.next;
        // }
        // else{
        //     count=count/2;
        //     head=current;
        //     head=head.next;
        // }
        // }
        return slow;
    }
}


