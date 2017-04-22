/**
 * Created by abiaps on 1/14/2017.
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count++;
            else {
                if (count > max) max = count;
                count = 0;
            }
        }
        if (count > max) return count;
        return max;

    }

    public static void main(String[] args) {
        int[] n = {1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.print(findMaxConsecutiveOnes(n));
    }
}
