public class DLL {

    private Node head;  // no one can access it outside

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        node.prev=null;
        if(head != null){
            head.prev = node;
        }
        head = node;

    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if(head == null){
            node = head;
            node.prev = null;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next= node;
        node.prev= last;

    }

    public void display(){
        Node node = head; // temp node for accessing node without changing the orginal ll
        Node last = null;  // inital last or tail equal to null
        while (node != null){
            System.out.print(node.val + " -> ");
            last = node;  // update everytime that current node is last, at some point the loop will end, we get last node
            node = node.next; // move node to next node
        }
        System.out.println("end");

        System.out.println("print in reverse");
        while(last != null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

   private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        // constructor
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}
