import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abiaps on 1/12/2017.
 */
public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int k = 0; k < nums.length; k++)
            if (!l.contains(nums[k])) l.add(nums[k]);
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        if (l.size() >= 3)
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) > max) {
                    thirdMax = secondMax;
                    secondMax = max;
                    max = l.get(i);
                } else if (l.get(i) > secondMax) {
                    thirdMax = secondMax;
                    secondMax = l.get(i);
                } else if (l.get(i) > thirdMax) thirdMax = l.get(i);
            }
        else
            for (int i = 0; i < l.size(); i++)
                if (l.get(i) > thirdMax) thirdMax = l.get(i);
        return thirdMax;
    }

    public static void main(String args[]) {
        int[] n = {1, 2, -43543568};
        System.out.print(thirdMax(n));
    }
}
