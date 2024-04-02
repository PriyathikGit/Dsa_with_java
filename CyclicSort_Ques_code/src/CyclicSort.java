import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cyclicSort(int[] arr) {
        int i =0; //initial the i pointer will be 0 it will keep checking the correct position of i, if correct i++
        while(i< arr.length){ // this loop will run n-1 mean i< arr.length
            int correct = arr[i] -1 ; // the correct position of i is value - 1 it will be its correct index
            if(arr[i] != arr[correct]){ // if the present value i is not at its correct position, swap to position
                swap(arr,i,correct); // swap i to its correct position
            } else { // if the above if condion not true enter it will only invalid when i its at it correct position
                i++; // this line say if i is at correct position then increment i and keep checking the correct position
            }
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
