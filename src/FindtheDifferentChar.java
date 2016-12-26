/**
 * Created by abiaps on 12/25/2016.
 */
public class FindtheDifferentChar {
    public static void main(String[] args) {

        String s = "abcd", t = "abcde";
        StringBuilder sb = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) != -1) {
                sb.deleteCharAt(t.indexOf(s.charAt(i)));
                t = sb.toString();
            }


        }
        System.out.println(sb.charAt(0));

    }
}
