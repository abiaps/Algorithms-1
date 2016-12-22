import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 12/22/2016.
 */
public class MajorityElementHashmap {
    public static void main(String args[]) {
        int[] in = {1, 2, 3, 2, 5, 3, 2};
        System.out.print(majorityElement(in));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int n = nums.length, ans = 0;
        double majority = Math.floor(n / 2);
        for (int i = 0; i < nums.length; i++) {
            if (!h.containsKey(nums[i]))
                h.put(nums[i], 1);
            else {
                int val = h.get(nums[i]);

                h.put(nums[i], ++val);
            }
        }
        System.out.println(h);
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            int val = entry.getValue();
            if (val > majority)
                ans = entry.getKey();
        }
        return ans;
    }
}
