public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,3,10,4};
        System.out.println(uniqueNumber(arr));
    }

     static int uniqueNumber(int[] arr) {
        int ans =0;
        for(int n: arr){
            ans ^= n;
        }
        return ans;
    }


}
