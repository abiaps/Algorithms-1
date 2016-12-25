/**
 * Created by abiaps on 12/25/2016.
 */
public class ExcelsheetColumnNumber {
    public static void main(String args[]) {
        String str = "CALL";
        int result = convertToTitle(str);
        System.out.println(result);
    }

    public static int convertToTitle(String s) {
        if (s.length() == 1)
            return ((int) s.charAt(0)) - 64;
        int i = 0;
        int ans = ((int) s.charAt(0)) - 64;
        while (i < s.length() - 1) {
            int op2 = ((int) s.charAt(i + 1)) - 64;
            ans = 26 * ans + op2;
            i++;

        }
        return ans;
    }
}
