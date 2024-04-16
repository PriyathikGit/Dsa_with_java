package Easy;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(0));
    }
    static int count(int n){
        return helper(n,0);
    }
    //special pattern, how to pass value to above calls
    //in this it will return to all the function whereever it was called
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
