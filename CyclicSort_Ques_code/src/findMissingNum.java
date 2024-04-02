import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/submissions/detail/1167030043/

public class findMissingNum {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }

    //normal cyclic sort
    static int findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i< nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);

            }
            else{
                i++;
            }
        }
        //Creating list with Arraylist
            List<Integer> ans = new ArrayList<>();
        //if number is not equal to index +1  value(here index start from 0 and the array is 1) then
//        it is the missing Number
            for (int index=0;index<nums.length;index++){
                if(nums[index] != index+1){
                    ans.add(index+1);
                }

            }
//            return ans;
        return -1;
    }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

}