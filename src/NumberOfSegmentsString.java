import java.util.StringTokenizer;

/**
 * Created by abiaps on 1/12/2017.
 */
public class NumberOfSegmentsString {
    public static int countSegments(String s) {
        if (s == "" || s.length() == 0) return 0;
        int ind = s.indexOf(' ');
        if (ind == -1) return 1;
        int i = 0, count = 0;
        while (i < s.length()) {
            ind = s.indexOf(' ');
            if (ind != -1) {
                if (i != ind) count++;
                s = s.substring(ind + 1);
                i = 0;
            } else {
                count += 1;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = " fdf john is my frd ";
        System.out.print(countSegments(s));
    }
}
