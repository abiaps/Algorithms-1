/**
 * Created by abiaps on 8/5/2017.
 */
public class MaximumSubarrayAverageI {
    public static double findMaxAverage(int[] nums, int k) {
        int st = 0, end = k, sum = 0, len = nums.length;
        double avg = 0.00;
        for (int i = st; i < k; i++)
            sum += nums[i];
        avg = (double) sum / k;
        double maxAvg = avg;
        if (len > 1) {
            sum -= nums[st];
            st++;
            while (end < len) {
                sum += nums[end];
                avg = (double) sum / k;
                if (avg > maxAvg) maxAvg = avg;
                sum -= nums[st];
                st++;
                end = (st + k) - 1;
            }
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 2}, 1));
    }
}
