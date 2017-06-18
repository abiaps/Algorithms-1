import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by abiaps on 6/17/2017.
 */
public class CombinationSumIII {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        combinationSum3(arr, k, n, 1, new int[10], 0);
        return ans;
    }

    public static void combinationSum3(ArrayList<Integer> arr, int k, int n, int start, int[] used, int sum) {
        if (arr.size() >= 1) sum += arr.get(arr.size() - 1);
        if (arr.size() == k && sum == n) {
            Collections.sort(arr);
            if (!ans.contains(arr)) ans.add(new ArrayList<Integer>(arr));
        }
        for (int i = start; i < 10; i++) {
            if (used[i] == 0) {
                arr.add(i);
                used[i] = 1;
                combinationSum3(arr, k, n, i + 1, used, sum);
                arr.remove(arr.size() - 1);
                used[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int k = 3, n = 7;
        System.out.print(combinationSum3(k, n));
    }
}
