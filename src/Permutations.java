import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abiaps on 6/18/2017.
 */
public class Permutations {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(nums);
        permute(nums, new int[nums.length], arr);
        return ans;
    }

    public static void permute(int[] nums, int[] used, ArrayList<Integer> arr) {
        if (arr.size() == nums.length) {
            if (!ans.contains(arr)) ans.add(new ArrayList<Integer>(arr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 0) {
                arr.add(nums[i]);
                used[i] = 1;
                permute(nums, used, arr);
                arr.remove(arr.size() - 1);
                used[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.print(permute(input));
    }
}
