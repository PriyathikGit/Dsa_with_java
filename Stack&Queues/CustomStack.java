public class CustomStack {

    protected int[] data;
    // static mean for every customstack object created the default size is 10
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
        // using this to call the CustomStack constructor
    }
    // two use case of this above and below
//    using this to make a new constructor
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int peek() throws CustomException{
        if(isEmpty()){
            throw new CustomException("cannot peek because stack is empty!!");
        }
        return data[ptr];
    }
    public int pop() throws CustomException{
        if(isEmpty()){
            throw new CustomException("cannot pop because stack is empty!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public boolean isFull() {
        return ptr == data.length-1; // pointer is at last index
    }
    public boolean isEmpty() {
        return ptr == -1; // array is empty
    }
}
