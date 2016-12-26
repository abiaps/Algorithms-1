/**
 * Created by abiaps on 12/25/2016.
 */
public class ReverseVowelsofString {
    public static void main(String[] args) {
        String s = "hello aunty";
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length() - 1;

        while (i < j) {
            if ((sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U') && (sb.charAt(j) == 'a' || sb.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' || sb.charAt(j) == 'A' || sb.charAt(j) == 'E' || sb.charAt(j) == 'I' || sb.charAt(j) == 'O' || sb.charAt(j) == 'U')) {
                sb.insert(i, sb.charAt(j));
                sb.insert(j + 1, sb.charAt(i + 1));
                sb.deleteCharAt(i + 1);
                sb.deleteCharAt(j + 1);
                i++;
                j--;
            }

            if (sb.charAt(i) != 'a' && sb.charAt(i) != 'e' && sb.charAt(i) != 'i' && sb.charAt(i) != 'o' && sb.charAt(i) != 'u' && sb.charAt(i) != 'A' && sb.charAt(i) != 'E' && sb.charAt(i) != 'I' && sb.charAt(i) != 'O' && sb.charAt(i) != 'U')
                i++;
            if (sb.charAt(j) != 'a' && sb.charAt(j) != 'e' && sb.charAt(j) != 'i' && sb.charAt(j) != 'o' && sb.charAt(j) != 'u' && sb.charAt(j) != 'A' && sb.charAt(j) != 'E' && sb.charAt(j) != 'I' && sb.charAt(j) != 'O' && sb.charAt(j) != 'U')
                j--;

        }

        System.out.print(sb.toString());
    }
}
