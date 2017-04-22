/**
 * Created by abiaps on 1/20/2017.
 */
public class Heaters {
    public static int getMax(int[] n) {
        int count = 0;
        for (int k = 0; k < n.length; k++)
            if (n[k] > count) count = n[k];
        return count;
    }

    public static int getMin(int[] n) {
        int count = Integer.MAX_VALUE;
        for (int k = 0; k < n.length; k++)
            if (n[k] < count) count = n[k];
        return count;
    }

    public static int findRadius(int[] houses, int[] heaters) {
        int count = 0, max1 = getMax(houses), max2 = getMax(heaters), min1 = getMin(houses), min2 = getMin(heaters);
        int limit = max1 > max2 ? max1 : max2;
        if (Math.abs(limit - max2) > 0) return Math.abs(limit - max2);
        else if (Math.abs(1 - min2) > 0) return Math.abs(1 - min2);
        for (int i = 2; i <= limit; i++) {
            if (heaters.length > houses.length) {
                if (i != heaters[i - 1])
                    count++;
            } else
                count++;
        }
        count = (int) Math.ceil(count / 2);
        return count;
    }

    public static void main(String[] args) {
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};
        System.out.print(findRadius(houses, heaters));
    }
}
