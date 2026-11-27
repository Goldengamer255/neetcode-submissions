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
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  // 1. save
            curr.next = prev;           // 2. flip
            prev = curr;                // 3. move prev
            curr = next;                // 4. move curr
        }

        return prev;
    }
}

// Final thoughts:
// The question says we are given the beginning of a single linked list and we need to reverse it and return the new beginning of the List
// so from the input and output what im thinking is we just reverse the list
// This is wrong idk how to do it so imma put it on red and learn it and then do a review later
// I start with prev as null and curr at the head. In a loop, I save curr.next, flip curr.next to point at prev, move prev up to curr, then move curr to the saved node. When curr is null, prev is the new head, so I return it. O(n) time, O(1) space

