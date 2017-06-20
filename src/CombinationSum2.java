import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abiaps on 6/19/2017.
 */
public class CombinationSum2 {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combinationSum2(candidates, new int[candidates.length], target, 0, arr, 0);
        return ans;
    }

    public static void combinationSum2(int[] candidates, int[] used, int target, int sum, ArrayList<Integer> arr, int start) {
        if (sum == target)
            if (!ans.contains(arr)) ans.add(new ArrayList<Integer>(arr));
        if (sum >= target) return;

        for (int i = start; i < candidates.length; i++) {
            if (sum < target && candidates[i] <= target) {
                used[i] = 1;
                sum += candidates[i];
                arr.add(candidates[i]);
                combinationSum2(candidates, used, target, sum, arr, i + 1);
                sum -= arr.get(arr.size() - 1);
                arr.remove(arr.size() - 1);
                used[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 5};
        System.out.print(combinationSum2(input, 5));
    }
}
