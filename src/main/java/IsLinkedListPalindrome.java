/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class IsLinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        ListNode middle = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        middle = slow;
        middle = reverseLL(middle);
        slow = head;

        while (middle != null) {
            if (middle.val != slow.val) return false;

            middle = middle.next;
            slow = slow.next;
        }

        return true;
    }

    private ListNode reverseLL(ListNode reverseHead) {
        ListNode temp = reverseHead;
        ListNode prev = null;
        while (null != temp) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}