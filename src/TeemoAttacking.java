import java.util.HashMap;

/**
 * Created by abiaps on 6/25/2017.
 */
public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        h.put(timeSeries[0], duration);
        for (int i = 1; i < timeSeries.length; i++) {
            int timeDif = timeSeries[i] - timeSeries[i - 1];
            if (timeDif < duration) h.put(timeSeries[i], h.get(timeSeries[i - 1]) + timeDif);
            else h.put(timeSeries[i], h.get(timeSeries[i - 1]) + duration);
        }
        return h.get(timeSeries[timeSeries.length - 1]);
    }

    public static void main(String[] args) {
        int[] input = {1, 4, 6, 8};
        System.out.println(findPoisonedDuration(input, 2));
    }
}
