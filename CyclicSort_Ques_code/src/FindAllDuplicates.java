import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        //initial the i pointer will be 0 it will keep checking the correct position of i, if correct i++
        int i =0;
        while(i< nums.length){ // this loop will run n-1 mean i< arr.length
            // the correct position of i is value - 1 it will be its correct index
            int correct = nums[i] -1 ;
            // if the present value i is not at its correct position, swap to position
            if(nums[i] != nums[correct]){
                swap(nums,i,correct); // swap i to its correct position
//                if the above if condion not true enter it will only invalid when i its at it correct position
            } else {
                // this line say if i is at correct position then increment i and keep checking the correct position
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        //if number is not equal to index +1  value(here index start from 0 and the array is 1) then
//        it is the missing Number
        for (int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }

        }
        return  ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
