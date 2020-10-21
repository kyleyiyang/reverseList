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
    public ListNode reverseList(ListNode head) {
        if (head==null) {
            return null;
        }
        ListNode h = new ListNode();
        h.val=head.val;
        while (head.next!=null) {
            h=new ListNode(head.next.val, h);
            head=head.next;
        }
        return h;
    }
}
