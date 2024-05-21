package Arrays;

import java.util.ArrayList;

public class DuplicateTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,10};
        int target = 5;
//        duplicate(arr,target,0);
//        System.out.println(list);
//        ArrayList<Integer> ans = duplicateWithArrayList(arr,target,0,new ArrayList<>());
        System.out.println(findIndex(arr,target,0));

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static int duplicate(int[] arr,int target,int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            list.add(index);
        }
           return duplicate(arr,target,index+1);

    }
    static ArrayList<Integer> duplicateWithArrayList(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return duplicateWithArrayList(arr,target,index+1,list);

    }

    static ArrayList<Integer> findIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this will contain answer to that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = findIndex(arr,target,index+1);

        list.addAll(ansFromBelow);
        return list;
    }
}
