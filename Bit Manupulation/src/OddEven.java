class Main{
    public static void main(String[] args) {
        int n=58;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
       return  (n&1) == 1;
    }
}