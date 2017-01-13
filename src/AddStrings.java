/**
 * Created by abiaps on 1/9/2017.
 */
public class AddStrings {
    public static String findSum(String m, String n) {
        int bal = 0, sum = 0;
        StringBuffer sb = new StringBuffer();
        for (int j = m.length() - 1; j > 0; j--) {
            int a = m.charAt(j) - '0';
            int b = n.charAt(j) - '0';
            sum += a + b;
            if (sum > 9) {
                bal = sum / 10;
                sum = sum % 10;
            }
            sb.insert(0, sum);
            sum = bal;
            bal = 0;
        }
        sb.insert(0, m.charAt(0) - '0' + n.charAt(0) - '0' + sum);
        return sb.toString();
    }

    public static void main(String args[]) {
        String s1 = "10";
        String s2 = "20";
        int l1 = s1.length();
        int l2 = s2.length();
        int d = Math.abs(l1 - l2);
        if (l1 < l2) {
            StringBuffer temp = new StringBuffer(s1);
            for (int i = 0; i < d; i++)
                temp.insert(0, '0');
            System.out.print(findSum(temp.toString(), s2));
        } else if (l2 < l1) {
            StringBuffer temp = new StringBuffer(s2);
            for (int i = 0; i < d; i++)
                temp.insert(0, '0');
            System.out.print(findSum(temp.toString(), s1));
        } else System.out.print(findSum(s1, s2));
    }
}
