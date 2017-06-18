import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by abiaps on 6/17/2017.
 */
public class Subsets {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ans.add(new ArrayList<Integer>(arr));
        subsets(arr, nums, new int[nums.length], 0);
        return ans;
    }

    public static void subsets(ArrayList<Integer> arr, int[] n, int[] used, int start) {
        if (arr.size() >= 1) {
            Collections.sort(arr);
            if (!ans.contains(arr)) ans.add(new ArrayList<Integer>(arr));
        }
        for (int i = start; i < n.length; i++) {
            if (used[i] == 0) {
                arr.add(n[i]);
                used[i] = 1;
                subsets(arr, n, used, i + 1);
                arr.remove(arr.size() - 1);
                used[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.print(subsets(input));
    }
}
