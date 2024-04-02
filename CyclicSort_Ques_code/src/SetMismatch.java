//https://leetcode.com/problems/set-mismatch/submissions/1171316624/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
    int i=0;
//    if not sorted array then apply cyclic sort
    while(i<nums.length){
        // array is starting from 1,N it means correct index is value-1
        int correct = nums[i] -1;
        if(nums[i] != nums[correct]){
           swap(nums,i,correct);
        } else {
            i++;
        }
    }
    // runnning loop for finding the duplicate number and the missing number
    for(int index = 0;index<nums.length;index++){
        // if
        if(nums[index] != index+1){
            return new int[] {nums[index],index+1};
        }

    }
        return new int[] {
            -1, -1
        };
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
