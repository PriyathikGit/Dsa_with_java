public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); // this super will call customStack(), because only this function has no paramters
    }
    public DynamicStack(int size) {
        super(size); // this super will call customStack(int size), because only this function has paramters
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data=temp;
        }
        return super.push(item);
    }
}
