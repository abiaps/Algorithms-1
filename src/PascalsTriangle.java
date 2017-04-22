import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 1/21/2017.
 */
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<Integer> curRow = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            curRow.add(0, 1);
            for (int j = 2; j < i + 1; j++) {
                curRow.set(j - 1, curRow.get(j) + curRow.get(j - 1));
            }
            res.add(new ArrayList<Integer>(curRow));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(generate(5));
    }
}
