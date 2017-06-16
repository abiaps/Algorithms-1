import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 6/15/2017.
 */
public class GeneratingParanthesis {

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        if (n == 0) return ans;
        if (n == 1) {
            ans.add("()");
            return ans;
        }
        generateParanthesis(n, 0, 0, "", ans);
        return ans;
    }

    public static void generateParanthesis(int max, int open, int close, String cur, List<String> ans) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }
        if (open < max)
            generateParanthesis(max, open + 1, close, cur + "(", ans);
        if (close < open)
            generateParanthesis(max, open, close + 1, cur + ")", ans);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
