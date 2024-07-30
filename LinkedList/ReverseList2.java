//    https://leetcode.com/problems/reverse-linked-list-ii/

public class ReverseList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        // skip the first node so our current come on left;
        for(int i =0;current != null && i<left-1;i++){
            prev = head;
            current = next;
            next = next.next;
        }
        ListNode newLast = prev;

        // reverse the linked list now from the current till the last node;

        while(current != null){
            prev = current;
            current= next;
            next = next.next;
        }
        ListNode last = current;
        if(last != null){
            last.next = newLast.next;
        } else{
            last = head;
        }
        head = current;
        return head;
    }
}
