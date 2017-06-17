import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by abiaps on 6/16/2017.
 */
public class CombinationSum {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        combinationSum(candidates, target, 0, temp);
        return ans;
    }

    public static void combinationSum(int[] candidates, int target, int sum, ArrayList<Integer> temp) {
        if (sum == target) {
            Collections.sort(temp);
            if (!ans.contains(temp)) ans.add(new ArrayList<>(temp));
            return;
        } else if (sum > target) return;
        for (int i = 0; i < candidates.length; i++) {
            sum += candidates[i];
            temp.add(candidates[i]);
            combinationSum(candidates, target, sum, temp);
            sum -= candidates[i];
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(input, target));
    }
}
