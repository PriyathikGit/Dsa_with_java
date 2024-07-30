import java.util.List;
//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMid(head);
        ListNode secondHead = reverse(mid);
        ListNode rereverseHead = secondHead;  // storing for reversing the head;


        // now compare the first half of list and second half
        while(head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverse(rereverseHead);
        if(head == null || secondHead == null){
            return true;
        }
        return false;
    }

    public ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = current.next;
        // reverse the list from mid;
        while(current != null){
            current.next = prev;
            prev = current;
            current=next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
