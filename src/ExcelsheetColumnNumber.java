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
        int ans = 0, i = 0;
        int op1 = ((int) s.charAt(0)) - 64;
        while (i < s.length() - 1) {
            int op2 = ((int) s.charAt(i + 1)) - 64;
            ans = 26 * op1 + op2;
            i++;
            op1 = ans;
        }
        return ans;
    }
}
