public class findMissingPositive {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            // we are skipping all negative number and nums should less than arr.length and the correct index is value-1
            if (arr[i]>0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for the missing number
        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index){
                return index+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
