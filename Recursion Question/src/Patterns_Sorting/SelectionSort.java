package Patterns_Sorting;

import java.util.Arrays;

// this algo is about the find maximum element element in the array and swap to the last index and decrease the length
// of  array every time so every time the most maximum element in the current pass get sort and placed to the last
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4};
        selection(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr,int row, int col, int max){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[max]){
                selection(arr,row,col+1,col);
            } else{
                selection(arr,row,col+1,max);
            }
        } else{
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selection(arr,row-1,0,0);
        }
    }
}
