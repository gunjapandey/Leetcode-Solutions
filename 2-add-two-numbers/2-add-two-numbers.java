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
         ListNode temp1 = l1;
        ListNode temp2 = l2;
        int size1 = 0;
        int size2 = 0;
        while(temp1 != null){
            temp1= temp1.next;
            size1++;
        }
        while(temp2 != null){
            temp2= temp2.next;
            size2++;
        }
        ListNode n1;
        ListNode n2;
        ListNode root = null;
        if(size1>size2){
            n1 = l1;
            n2 = l2;
        }else{
            n1 = l2;
            n2 = l1;
        }
        int carry = 0;
        while(n1 != null){
            
            if(n2 != null){
                n1.val = n1.val + n2.val + carry;
                n2 = n2.next;
            }else{
                n1.val = n1.val + carry;
            }
            carry = 0;
            if(n1.val > 9){
                int x = n1.val;
                n1.val = x%10;
                carry = x/10;
            }
            root = n1;
            n1 = n1.next;
        }
        if(carry!= 0){
            
            ListNode l = new ListNode(carry);
            root.next = l;
        }
        
        if(size1>size2){
            return l1;
        }else{
            return l2;
        }
    }
}