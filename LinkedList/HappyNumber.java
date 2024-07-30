//https://leetcode.com/problems/happy-number/submissions/1335197206/

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow = squareRoot(slow);
            fast = squareRoot(squareRoot(fast));
        }
        while(fast != slow);
        if(fast==1) {
            return true;
        }
        return false;
    }
    public static int squareRoot(int number){
        int ans = 0;
        while(number>0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
}
