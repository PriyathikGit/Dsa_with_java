public class MagicNumber {
    public static void main(String[] args) {
        int n=3;
        // adding the ans
        int ans =0;
        // initial base is 5, it will update in every pass until n < 0
        int base =5;
        while(n>0){
            // finding the last digit in the binary form, internally it will do automatically
            int last = n&1;
            // right shift n and update the value of n in every pass, it will ignore the last digit in binary form
            n= n>>1;
            ans += last * base;
            base = base *5;
        }
        System.out.println(ans);
    }
}
