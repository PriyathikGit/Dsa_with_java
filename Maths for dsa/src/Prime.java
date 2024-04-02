//public class Prime {
//    public static void main(String[] args) {
//        int n =11;
//        System.out.println(prime(n));
//    }
//
//     static boolean prime(int n) {
//        boolean isPrime = true;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                return  isPrime =false;
//            }
//        }
//        return isPrime;
//    }
//}

class Prime{
    public static void main(String[] args) {
        int n = 20;
        for (int i=1;i<=20;i++){
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}