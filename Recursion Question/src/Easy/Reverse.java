package Easy;

public class Reverse {
    public static void main(String[] args) {
//        reverseWay1(12345);
//        System.out.println(sum);
        System.out.println(reverseWay2(101301));
    }
//    static int reverse(int n){
//        int start =0;
//        int end = String.valueOf(n).length()-1;
//        char[] arr = String.valueOf(n).toCharArray();
//        while(start<end){
//            char temp = arr[start];
//            arr[start] = arr[end];
//            arr[end]= temp;
//            start++;
//            end--;
//        }
//        return Integer.parseInt(new String(arr));
//    }
    static int sum=0;
    static void reverseWay1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverseWay1(n/10);
    }

    static int reverseWay2(int n){
        int digits = (int) (Math.log10(n));
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits)) + helper(n/10,digits-1);
    }
}
