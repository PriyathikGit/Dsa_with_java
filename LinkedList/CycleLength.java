//public class CycleLength {
//    public static void main(String[] args) {
//
//    }
//    // cycle detection in linked list
//    public void hasCycle(ListNode head){
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null && fast.next !=null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//
//            }
//
//        }
//        return false;
//    }
//    // length og cycle
//    public int cycleLength(ListNode head){
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null && fast.next !=null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                ListNode temp = slow;
//                int count =0;
//                do{
//                    temp = temp.next;
//                    count++;
//                } while (temp.next != slow);
//                return count;
//            }
//        }
//        return 0;
//    }
//
//    // return the starting node of cycle detection
////    https://leetcode.com/problems/linked-list-cycle-ii/
//
//    public ListNode detectCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        int length =0;
//        while(fast != null && fast.next !=null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                length = cycleLength(slow);
//                break;
//            }
//        }
//        if(length ==0){
//            return null;
//        }
//        // find the start node
//        ListNode f = head;
//        ListNOde s = head;
//        while(length>0){
//            s = s.next;
//            length--;
//        }
//
//        while(f!=s){
//            f=f.next;
//            s=s.next;
//        }
//        return f;
//    }
//
//}
