import java.util.ArrayList;

/**
 * Created by abiaps on 8/13/2017.
 */
public class ArrayNesting {
    public static int arrayNesting(int[] nums) {
        int k = 0, maxLen = Integer.MIN_VALUE;
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            k = i;
            while ((!visited[k]) && k < nums.length) {
                visited[k] = true;
                k = nums[k];
                count++;
            }
            maxLen = maxLen > count ? maxLen : count;
        }
        return maxLen;
    }

    public static void main(String[] args) {

        System.out.println(arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2}));
    }
}
