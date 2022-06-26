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
    ListNode temp=node.next;
    node.val=temp.val;
    if(temp.next!=null){
        node.next=temp.next;
    }else{
        node.next=null;
    }
    }
}