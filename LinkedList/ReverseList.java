//    https://leetcode.com/problems/reverse-linked-list/

public class ReverseList {

    // recursion
    public void Reverse(ListNode Node){
        // base condtion
        if(head == tail){
            head = tail;
            return;
        }
        Reverse(head.next);
        // when out of recursion do tail next value is current node
        tail.next = Node;
        // make current node tail
        tail = node;
        // make next node null so it add the upcoming node in place of null
        tail.next = null;
    }

//    iteration to reverse the list
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
    // now head become prev (head = prev and return head)
    return prev;
}
}
