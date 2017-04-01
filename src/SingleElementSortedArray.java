import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abiaps on 3/31/2017.
 */
public class SingleElementSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(nums.length);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!h.containsKey(nums[i]))
                h.put(nums[i], 1);
            else
                h.put(nums[i], h.get(nums[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> m : h.entrySet())
            if (m.getValue() == 1) {
                ans = m.getKey();
                break;
            }
        return ans;
    }

    public static void main(String[] args) {
        SingleElementSortedArray so = new SingleElementSortedArray();
        int[] n = {1, 1, 0};
        System.out.println(singleNonDuplicate(n));
    }
}
