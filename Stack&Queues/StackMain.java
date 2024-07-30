public class StackMain {
    public static void main(String[] args) throws CustomException {
        DynamicStack stack = new DynamicStack(5);
        stack.push(12);
        stack.push(18);
        stack.push(25);
        stack.push(45);
        stack.push(50);
        stack.push(56);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
