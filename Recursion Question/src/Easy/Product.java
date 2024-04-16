package Easy;

public class Product {
    public static void main(String[] args) {
        int ans = product(505);
        System.out.println(ans);
    }
    static int product(int n){
        // our last recursive call will give product(5), so n=5;
        // n%10 is 5 and it is equal to current n
        // so it will return the n
        if(n%10==n){
            return n;
        }
        return (n%10)* product(n/10);
    }
}


