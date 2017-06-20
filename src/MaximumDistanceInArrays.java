import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 6/20/2017.
 */
public class MaximumDistanceInArrays {
    public static int maxDistance(List<List<Integer>> arrays) {
        List<Integer> temp = new ArrayList<Integer>(arrays.get(0));
        int max = temp.get(temp.size() - 1), min = temp.get(0), dif = 0;
        temp.clear();
        for (int i = 1; i < arrays.size(); i++) {
            temp = arrays.get(i);
            int first = temp.get(0);
            int last = temp.get(temp.size() - 1);
            if (first < min) dif = Math.max(dif, Math.abs(max - first));
            if (last > max) {
                if (Math.abs(last - min) > dif) dif = Math.max(dif, Math.abs(last - min));
            } else if (first >= min && last <= max)
                dif = Math.max(dif, Math.max(Math.abs(last - min), Math.abs(max - first)));
            min = Math.min(min, first);
            max = Math.max(max, last);
            temp.clear();
        }
        return dif;
    }

    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(4);
        input.add(new ArrayList<>(arr));
        arr.clear();
        arr.add(0);
        arr.add(5);
        input.add(new ArrayList<>(arr));
        System.out.println(maxDistance(input));
    }
}
