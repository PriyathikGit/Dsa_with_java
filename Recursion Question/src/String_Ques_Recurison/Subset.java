package String_Ques_Recurison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        // int[] arr1 = {};
        // int[] arr2 = {1, 2, 3};
        // System.out.println(Arrays.toString(subset(arr1, arr2)));
    }

    // subset using recursion
    static int[] subset(int[] p, int[] up) {
        if (up.length == 0) {
            return p;
        }

        int index = up[0];
        int[] newP = Arrays.copyOf(p, p.length + 1);
        newP[newP.length - 1] = index;
        subset(newP, Arrays.copyOfRange(up, 1, up.length));
        subset(p, Arrays.copyOfRange(up, 1, up.length));

        return p;
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int nums : arr) {
            // creating a size of the outer array
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                // making copy of the outer array nums into new array
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            // if current and previous element are same s=e+1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            // creating a size of the outer array
            int n = outer.size();
            for (int j = start; j < n; j++) {
                // making copy of the outer array nums into new array
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}

