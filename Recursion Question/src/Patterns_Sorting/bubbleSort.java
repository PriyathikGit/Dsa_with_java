package Patterns_Sorting;

import java.util.Arrays;

// patterns and these two sorting technique concept is same our whole array is row and every element is column

// bubble sort the check the adjacent element if it current element is bigger swap it two to the next element which is
// smaller and in every pass the maximum element will come at last
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr,int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1]=temp;
            }
            bubble(arr, row, col+1);
        } else{
            bubble(arr, row-1, 0);
        }
    }
}
