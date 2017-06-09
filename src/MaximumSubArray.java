import java.util.ArrayList;
import java.util.HashMap;

public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {
        int sum = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + sum > nums[i])
                sum += nums[i];
            else sum = nums[i];
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = {0};
        System.out.println(maxSubArray(input));
    }
}
