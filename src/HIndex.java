import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by abiaps on 4/3/2017.
 */
public class HIndex {
    public static int hIndex(int[] citations) {
        if (citations.length == 1 && citations[0] > 0) return 1;
        else if (citations.length == 1 && citations[0] == 0) return 0;
        int max = 0, n = citations.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (!list.contains(citations[i]))
                list.add(citations[i]);
            int h = n - i, nonH = n - h;
            if (nonH > 0) {
                if (h > max)
                    max = h;
            }
        }
        if (list.size() == 1)
            return list.get(0);
        return max;
    }

    public static void main(String[] args) {
        int[] n = {2, 1, 1};
        System.out.println(hIndex(n));
    }
}
