import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by abiaps on 6/21/2017.
 */
public class PascalsTriangleII {
    static ArrayList<Integer> ans = new ArrayList<Integer>();
    static ArrayList<Integer> temp = new ArrayList<Integer>();

    public static List<Integer> getRow(int rowIndex) {
        ans.add(0);
        ans.add(1);
        ans.add(0);
        if (rowIndex == 0) {
            ans.remove(0);
            ans.remove(ans.size() - 1);
            return ans;
        }
        getRow(ans, rowIndex, 1, temp);
        ans.remove(0);
        ans.remove(ans.size() - 1);
        return ans;
    }

    public static void getRow(ArrayList<Integer> arr, int k, int curIndex, ArrayList<Integer> temp) {
        if (curIndex <= k) {
            temp.clear();
            temp.add(0);
            for (int i = 0; i < curIndex + 1; i++) temp.add(arr.get(i) + arr.get(i + 1));
            temp.add(0);
            getRow(new ArrayList<>(temp), k, curIndex + 1, temp);
        }
        ans.clear();
        ans.addAll(temp);
    }

    public static void main(String[] args) {
        System.out.print(getRow(15));
    }
}
