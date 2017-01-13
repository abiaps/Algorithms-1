import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 1/13/2017.
 */
public class DisappearedNumbersArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] n = new int[nums.length + 1];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) n[nums[i]] = nums[i];
        for (int i = 1; i < n.length; i++) {
            if (i - n[i] != 0)
                ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.print(findDisappearedNumbers(n));
    }
}
