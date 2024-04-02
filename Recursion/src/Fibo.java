public class Fibo {
    public static void main(String[] args) {
//        int ans = fibo(4);
//        System.out.println(ans);
//        for (int i = 0; i < 50; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5)) / 2),n) / Math.sqrt(5));
    }
     static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
