import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by abiaps on 4/1/2017.
 */
public class MissingNumberinArray {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid = (left + right) / 2;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > mid) right = mid;
            else left = mid + 1;
        }
        return left;

    }

    public static void main(String[] args) {
        int[] input = {0, 1, 3};
        System.out.println(missingNumber(input));

    }
}
