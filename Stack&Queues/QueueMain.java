public class QueueMain  {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(12);
//        queue.insert(18);
//        queue.insert(25);
//        queue.insert(45);
//        queue.insert(50);
//        queue.insert(56);

        CircularQueue queue = new CircularQueue(5);
        queue.insert(12);
        queue.insert(18);
        queue.insert(25);
        queue.insert(45);
        queue.insert(50);


        queue.display();


        System.out.println(queue.remove());
        queue.insert(15);
        queue.display();
    }
}
