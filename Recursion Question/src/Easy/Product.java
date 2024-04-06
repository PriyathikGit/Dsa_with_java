package Easy;

public class Product {
    public static void main(String[] args) {
        int ans = product(1342);
        System.out.println(ans);
    }
    static int product(int n){
        if(n==1){
            return 1;
        }
        return (n%10)* product(n/10);
    }
}


