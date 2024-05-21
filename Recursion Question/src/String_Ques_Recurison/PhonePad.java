package String_Ques_Recurison;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
//    public static void main(String[] args) {
//        pad("","23");
//        System.out.println(padRet("","12"));
//        System.out.println(padCount("","12"));
//    }
//    static void pad(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        int digit = up.charAt(0)-'0'; // converting '1' to 1
//        // range is digit-1*3 till digit-1, ex 1 contain abc and i will be 0 till 2 where 0 is a,1 is b and 2 is c
//        for (int i = (digit-1)*3;i<digit*3;i++){
//            char ch = (char) (i+'a');
//            pad(p+ch,up.substring(1));
//        }
//    }
//    static List<String> padRet(String p, String up){
//        if(up.isEmpty()){
//            List<String> ans = new ArrayList<>();
//            ans.add(p);
//            return ans;
//        }
//        List<String> list = new ArrayList<>();
//        int digit = up.charAt(0)-'0'; // converting '1' to 1
//        // range is digit-1*3 till digit-1, ex 1 contain abc and i will be 0 till 2 where 0 is a,1 is b and 2 is c
//        for (int i = (digit-1)*3;i<digit*3;i++){
//            char ch = (char) (i+'a');
//            list.addAll(padRet(p+ch,up.substring(1)));
//        }
//        return list;
//    }
//
//    static int padCount(String p, String up){
//        if(up.isEmpty()){
//            return 1;
//        }
//        int count =0;
//        int digit = up.charAt(0)-'0'; // converting '1' to 1
//        // range is digit-1*3 till digit-1, ex 1 contain abc and i will be 0 till 2 where 0 is a,1 is b and 2 is c
//        for (int i = (digit-1)*3;i<digit*3;i++){
//            char ch = (char) (i+'a');
//            count = count +padCount(p+ch,up.substring(1));
//        }
//        return count;
//    }
public static void main(String[] args) {
    int[] nums = {3,3,4};
    System.out.println((ans(nums)));
}
static  int ans(int[] nums){
    int ans =0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            ans = nums[i];
        } else{
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ans = nums[i];
                }
            }
        }
    }
    return ans;
}
}
