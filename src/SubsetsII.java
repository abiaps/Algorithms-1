import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by abiaps on 6/17/2017.
 */
public class SubsetsII {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ans.add(new ArrayList<>(arr));
        Arrays.sort(nums);
        subsetsWithDup(nums, arr, 0, nums.length - 1, new int[nums.length]);
        return ans;
    }

    public static void subsetsWithDup(int[] nums, ArrayList<Integer> arr, int start, int end, int[] used) {
        if (arr.size() >= 1 && (!ans.contains(arr))) {
            Collections.sort(arr);
            if (!ans.contains(arr))
                ans.add(new ArrayList<>(arr));
        }
        for (int i = start; i < nums.length; i++) {
            if (used[i] == 0) {
                used[i] = 1;
                arr.add(nums[i]);
                subsetsWithDup(nums, arr, i + 1, end, used);
                arr.remove(arr.size() - 1);
                used[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 2};
        System.out.println(subsetsWithDup(input));
    }
}
