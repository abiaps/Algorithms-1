import java.util.ArrayList;

/**
 * Created by abiaps on 10/7/2017.
 */
public class LongestSubstringCount {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        ArrayList<Character> a = new ArrayList<Character>();
        int max = Integer.MIN_VALUE, start = 0, end = 0, pos = 0, pos1 = 0;
        while (start < s.length() && end < s.length()) {
            if (start == end && end == s.length() - 1) break;
            if (!a.contains(s.charAt(end))) {
                a.add(s.charAt(end));
                end++;
            } else {
                max = a.size() > max ? a.size() : max;
                pos = a.indexOf(s.charAt(end));
                pos1 = pos + start;
                a.subList(0, pos + 1).clear();
                start = pos1 + 1;
                if (start == end) end++;
                if (start < s.length() && !a.contains(s.charAt(start))) a.add(s.charAt(start));
            }
        }
        return max > a.size() ? max : a.size();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbcksdjfhlaskjsahdfkljslakdgflhgfigbkjdjkfhuieieasjdafaohewikjdsbkjfiuifkdshfljksdjfjshgdfjhvasfvkjhgeuioupforeengkjlhfivjkk"));
    }
}
