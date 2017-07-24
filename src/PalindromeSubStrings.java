/**
 * Created by abiaps on 7/23/2017.
 */
public class PalindromeSubStrings {
    public static int countSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.toString().equals(sb.reverse().toString())) count++;
            sb.reverse();
            for (int j = i + 1; j < s.length(); j++) {
                sb.insert(sb.length(), s.charAt(j));
                if (sb.toString().equals(sb.reverse().toString())) count++;
                sb.reverse();
            }
            sb.setLength(0);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abccba"));
    }
}
