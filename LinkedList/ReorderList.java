//https://leetcode.com/problems/reorder-list/description/
public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode firstHead = head;
        ListNode mid = getMid(head);
        ListNode secondHead = reverse(mid.next);
        while(head != null && secondHead != null){
            ListNode temp = head.next;
            firstHead.next= secondHead;
            firstHead = temp;
            temp = secondHead.next;
            secondHead.next=temp;
            secondHead=temp;
        }
        return head;
    }

    public ListNode getMid(ListNode head){
        ListNode first = head;
        ListNode slow = head;
        while(first != null && first.next != null){
            first = first.next.next;
            slow= slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }
        return prev;
    }
}
