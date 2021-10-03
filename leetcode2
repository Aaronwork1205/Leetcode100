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
       if (l1 != null || l2 != null) {
           ListNode sol = new ListNode();
           int temp = l1.val + l2.val;
           int temp2 = l1.val + l2.val;
           if (temp >= 10) {
               temp = temp % 10;
               sol.val = temp;
               if (l1.next != null) {
                   l1.next.val +=1;
                   sol.next = addTwoNumbers(l1.next, l2.next);
                   l1.next.val -=1;
               } else {
                   sol.next = addTwoNumbers(l1.next, l2.next);
               }
               if (temp2 >= 10 && l1.next == null && l2.next == null) {
                   ListNode newDigit = new ListNode(1);
                   sol.next = newDigit;
               }
           } else {
               sol.val = temp;
               sol.next = addTwoNumbers(l1.next, l2.next);
           }
           return sol;
       } else {
           return null;
       }
    }
}
