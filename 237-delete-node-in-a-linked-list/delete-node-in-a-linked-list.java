/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    // ListNode temp=node;
    // while(temp!=null && temp.next!=null){
    //     if(temp.next.val==node.val){
    //         temp.next=temp.next.next;
    //     }temp=temp.next;
    // }
    // return node;
    }
}