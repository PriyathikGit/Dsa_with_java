package Patterns_Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;

        // if any pointer i and j comes out from the array like range exceed so the loop will be over
        while(i< first.length && j< second.length){
            // if element of first array is smaller than the first element of seconf array then put the smaller
            // element into the new array
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++; // every time i pointer will increase

            }
            // if not then the put the element of second array into the new array
            else{
                mix[k] = second[j];
                j++;
            }
            k++; // whenever added a element move ahead
        }
            // it may be possible that one of the array not completed
        // copy the remaining elements
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}





