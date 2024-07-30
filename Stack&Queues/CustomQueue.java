public class CustomQueue {
    protected int[] data;
    // static mean for every customstack object created the default size is 10
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
        // using this to call the CustomStack constructor
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty cannot remove item");
        }
        int removed = data[0];

        // shift the elements to left now because first index is empty

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty cannot remove item");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("end");
    }

    public boolean isFull() {
        return end == data.length; // pointer is at last index
    }
    public boolean isEmpty() {
        return end == 0; // array is empty
    }
}
