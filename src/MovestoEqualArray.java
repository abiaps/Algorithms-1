/**
 * Created by abiaps on 1/13/2017.
 */
public class MovestoEqualArray {
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] < min) min = nums[i];
        return min;
    }

    public static int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE, move = 0, max_ind = -1, ans = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max) {
                max = nums[i];
                max_ind = i;
                if (max == Integer.MAX_VALUE) {
                    ans = findMin(nums);
                    ans = Integer.MAX_VALUE - ans;
                }
            }
        if (ans > 1) return ans;
        for (int i = 0; i < nums.length; i++)
            if (i != max_ind)
                nums[i] += 1;
        int n = nums[0];
        int flag = -1;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != n) {
                flag = 1;
                break;
            }
        if (flag == 1) move += minMoves(nums);
        return move + 1;
    }

    public static void main(String[] args) {
        int[] n = {1, 2147483647};
        System.out.print(minMoves(n));
    }
}
