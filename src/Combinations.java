import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by abiaps on 6/17/2017.
 */
public class Combinations {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        combine(new int[n + 1], k, arr, 1);
        return ans;
    }

    public static void combine(int[] used, int k, ArrayList<Integer> arr, int start) {
        if (arr.size() == k) {
            Collections.sort(arr);
            ans.add(new ArrayList<Integer>(arr));
            return;
        }
        for (int i = start; i < used.length; i++) {
            if (used[i] == 0) {
                arr.add(i);
                used[i] = 1;
                combine(used, k, arr, i + 1);
                arr.remove(arr.size() - 1);
                used[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4, k = 2;

    }
}
