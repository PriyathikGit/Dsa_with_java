package Arrays;

public class RBS {
    public static void main(String[] args) {
    int[] arr = {9,8,7,6,1,2,3};
        System.out.println(searchArr(arr,2,0,arr.length-1));
    }
    static int searchArr(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[s]<=nums[mid]){
            if(target>=nums[s] && target<=nums[mid]){
               return searchArr(nums,target,s,mid-1);
            } else{
                return searchArr(nums,target,mid+1,e);
            }
        }
            if(target>=nums[mid]&& target<=nums[e]){
              return  searchArr(nums,target,mid+1,e);
            }
        return searchArr(nums,target,s,mid-1);
    }

}
