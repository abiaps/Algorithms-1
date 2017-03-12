import java.util.Scanner;

/**
 * Created by abiaps on 3/12/2017.
 */
public class CountNumbersUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int curr = 9, count = 10, flag = 0, res = 0, ans = 0;
        for (int i = 1; i < n; i++) {
            if (flag == 0) {
                res = curr * curr;
                ans += res;
                flag = 1;
            } else {
                res = res * curr;
                ans += res;
            }
            curr--;
        }
        return count + ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(countNumbersWithUniqueDigits(s.nextInt()));
    }
}
