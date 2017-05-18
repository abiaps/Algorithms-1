/**
 * Created by abiaps on 5/17/2017.
 */
public class ReverseStringsII {
    public static String reverseStr(String s, int k) {
        int i = 0;
        String ans = "";
        while ((i + (2 * k)) <= s.length()) {
            StringBuilder temp = new StringBuilder(s.substring(i, (i + 2 * k)));
            ans += reverse(temp.toString(), k);
            i += 2 * k;
        }
        if (i < s.length()) {
            StringBuilder sb = new StringBuilder(s.substring(i));
            if (sb.length() < k)
                ans += sb.reverse().toString();
            else if (sb.length() >= k && sb.length() < 2 * k)
                ans += reverse(sb.toString(), k);
        }
        return ans;
    }

    public static String reverse(String t, int k) {
        StringBuilder sb1 = new StringBuilder(t.substring(0, k));
        return sb1.reverse().toString() + t.substring(k);
    }

    public static void main(String[] args) {
        String input = "abcdefgh";
        int k = 2;
        System.out.println(reverseStr(input, k));
    }
}
