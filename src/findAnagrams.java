import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 6/10/2017.
 */
public class findAnagrams {
    public static void main(String[] args) {
        String s = "abcdefgabc", p = "abc";
        int start = 0, end = 0, count = p.length();
        int[] arr = new int[256];
        char[] shortString = p.toCharArray();
        for (char c : shortString) {
            arr[c]++;
        }
        List<Integer> ans = new ArrayList<Integer>();
        while (end < s.length()) {
            if (arr[s.charAt(end)] >= 1) count--;
            arr[s.charAt(end)]--;
            end++;
            if (count == 0) ans.add(start);
            if (p.length() == end - start) {
                if (arr[s.charAt(start)] >= 0) count++;
                arr[s.charAt(start)]++;
                start++;
            }
        }
        System.out.println(ans);
    }
}
