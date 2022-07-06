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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val ==val) {
            head = head.next;
        }
        ListNode currHead = head;
        while(currHead != null && currHead.next != null) {
            if(currHead.next.val == val) {
                currHead.next = currHead.next.next;
            } else {
                currHead = currHead.next;
            }
        }
        return head;
    }
}