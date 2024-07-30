public class CircularQueue {
    protected int[] data;
    // static mean for every customstack object created the default size is 10
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
        // using this to call the CustomStack constructor
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }
    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty cannot remove item");
        }
        int removed = data[front++];
        front=front% data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty cannot remove item");
        }
        return data[front];
    }
    public void display(){
        if (isEmpty()){
            System.out.println("empty");
            return;
        }
       int i = front;
       do{
           System.out.print(data[i]+" ->");
           i++;
           i%= data.length;
       } while (i != end);
        System.out.println("end");
    }
    public boolean isFull() {
        return size == data.length; // pointer is at last index
    }
    public boolean isEmpty() {
        return size == 0; // array is empty
    }
}
