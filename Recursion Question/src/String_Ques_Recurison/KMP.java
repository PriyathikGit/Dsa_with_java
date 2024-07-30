package String_Ques_Recurison;

//public class KMP {
//    public static void main(String[] args) {
////        String s = "roorsp";
////        System.out.println(answer(s));
//        String a = "aaac";
//        String b = "aac";
//        System.out.println(repeatedString(a, b));;
//    }
//
////    static int answer(String str){
////        String Str1 = str+'$'+reverse(str);
////
////        int size = str.length();
////
////        int n = Str1.length();
////        int[] lps = new int[n];
////        int pre=0;
////        int suf =1;
////
////        while(suf<Str1.length()){
////            // if matched the prefix and suffix
////            if(Str1.charAt(pre)==Str1.charAt(suf)){
////                lps[suf] = pre+1;
////                pre++;
////                suf++;
////            } else{
////                if(pre==0){
////                    lps[suf] = 0;
////                    suf++;
////                } else{
////                    pre = lps[pre-1];
////                }
////            }
////        }
////        return size - lps[n-1];
////    }
////
////    static String reverse(String s){
////        StringBuilder sb = new StringBuilder(s);
////        return sb.reverse().toString();
////    }
//
//    static int repeatedString(String a, String b) {
//        if (a == b) {
//            return 1;
//        }
//
//        String temp = a;
//        int repeat = 1;
//        while (temp.length() < b.length()) {
//            temp += a;
//            repeat++;
//        }
//
//        // KMP search if substring found the temp variable
//        if (KMP_SEARCH(temp, b) == 1) {
//            return repeat;
//        }
//
//        // KMP search if substring not found in the temp so add one more time a string into it
//        if (KMP_SEARCH(temp + a, b) == 1) {
//            return repeat+1;
//        }
//        return -1;
//    }
//
//    static int KMP_SEARCH(String a, String b) {
//        int[] lps = new int[b.length()];
//        kmp(lps, b);
//        return answer(lps, a, b);
//    }
//
//    static int[] kmp(int[] lps, String b) {
//        int pre = 0;
//        int suf = 1;
//        // if char is matching
//        while (suf < b.length()) {
//            if (b.charAt(pre) == b.charAt(suf)) {
//                lps[suf] = pre + 1;
//                pre++;
//                suf++;
//            }
//            // char is not matching
//            else {
//                if (pre == 0) {
//                    lps[suf] = 0;
//                    suf++;
//                } else {
//                    pre = lps[pre - 1];
//                }
//            }
//        }
//        return lps;
//    }
//
//    static int answer(int[] lps, String a, String b) {
//        int i = 0;
//        int j = 0;
//       while(i<a.length()&&j<b.length()){
//           if (a.charAt(i) == b.charAt(j)) {
//               i++;
//               j++;
//           } else {
//               if (j == 0) {
//                   i++;
//               } else {
//                   j = lps[j - 1];
//               }
//           }
//       }
//        if (j == b.length()) {
//            return 1;
//        }
//        return -1;
//    }
//}

import java.util.HashMap;

public class KMP {
    public static void main(String[] args) {
//        long[] arr = {0,0,5,5,0,0};
        int[] arr = {1,1,1,1,1,3,2};
        int target = 5;
//        int n = arr.length;
//        System.out.println(findSubarray(arr, n));
        System.out.println(subArray(arr,target));
    }

//    static long findSubarray(long[] arr, int n) {
//        HashMap<Long, Integer> map = new HashMap<>();
//        long sum = 0;
//        long total = 0;
//
//        // Initialize the map with the sum 0 having frequency 1 to handle subarrays
//        // starting from the beginning
//        map.put(0L, 1);
//
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//
//            // If the sum has been seen before, it means there are subarrays
//            // with sum equal to zero ending at index i
//            if (map.containsKey(sum)) {
//                total += map.get(sum);
//                map.put(sum, map.get(sum) + 1);
//            } else {
//                map.put(sum, 1);
//            }
//        }
//
//        return total;
//    }

    static int subArray(int[] nums,int target){
        int start =0;
        int end =0;
        int sum=0;
        int size =  ans(nums);
        int total = 0;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>=target){
                size = Math.min(size,end-start+1);
                sum-= nums[start];
                start++;
            }
            end++;
        }
        return sum==size?0:size;
    }
    static int ans(int[] arr){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }

}
