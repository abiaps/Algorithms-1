import java.util.ArrayList;

/**
 * Created by abiaps on 4/3/2017.
 */
public class FindingtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int ans = 0;
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!l.contains(nums[i]))
                l.add(nums[i]);
            else {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1, 1};
        System.out.print(findDuplicate(n));
    }
}
