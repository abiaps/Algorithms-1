import java.util.Arrays;

public class findContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        int i = 0, j = 0, count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {1, 1, 3}, s = {1, 1, 3};
        System.out.println(findContentChildren(g, s));
    }
}
