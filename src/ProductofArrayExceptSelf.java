/**
 * Created by abiaps on 3/31/2017.
 */
public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1, count = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) product *= nums[i];  //product of non-zero elements
            else {
                count++;
                if (count == 2) product = 0;
                flag = true;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                if (flag == true) ans[j] = 0;
                else ans[j] = product / nums[j];
            } else ans[j] = product;
        }
        return ans;

    }

    public static void main(String[] args) {
        int n[] = {0, 1, 3, 2, 5};
        int[] ans = productExceptSelf(n);
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }
}
