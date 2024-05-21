package Arrays;

public class Target {
    public static void main(String[] args) {
        int[] arr = {1,3,15,1,55,0};
        int target = 55;
        System.out.println(isExist(arr,target,0));
        System.out.println(index(arr,target,0));
        System.out.println(searchFromLast(arr,target,arr.length-1));
    }

    // return boolean value if exist
    static boolean isExist(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || isExist(arr,target,index+1);
    }

    // return index
    static int index(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
           return index(arr, target, index + 1);
        }
        }

    static int searchFromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return searchFromLast(arr, target, index - 1);
        }
    }
}
