/**
 * Created by abiaps on 12/24/2016.
 */
public class ExcelsheetColumnTitle {
    public static void main(String args[]) {
        int n = 158624;
        String result = convertToTitle(n);
        System.out.println(result);
    }

    public static String convertToTitle(int n) {
        String ans = "", rem = "";
        if (n == 0)
            return ans;
        int r = 0, q = 0;
        char[] c = {'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        if (n <= 26)
            return ans + c[n];
        while (n > 26) {

            q = n / 26;
            r = n % 26;
            if (r == 0) q = q - 1;
            n = q;
            rem += c[r];

        }
        StringBuilder sb = new StringBuilder(rem);
        return ans + c[q] + sb.reverse();

    }
}
