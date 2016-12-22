/**
 * Created by abiaps on 12/22/2016.
 */
public class MajorityElement {
    public static void main(String args[]) {
        int[] in = {1, 2, 3, 2, 5, 3, 2};
        System.out.print(majorityElement(in));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        double majority = Math.floor(n / 2);
        System.out.println(majority);
        int count = 0, flag = 0, ans = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count >= majority) {
                        flag = 1;
                        ans = nums[i];
                        break;
                    }
                }
            }
            if (flag == 1)
                break;

            else
                count = 0;
        }

        return ans;
    }
}
