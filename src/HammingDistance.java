/**
 * Created by abiaps on 1/13/2017.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int count = 0, i = 0;
        while (i < 32) {
            if ((x & 1) % 10 != (y & 1) % 10)
                count++;
            x = x >> 1;
            y = y >> 1;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(hammingDistance(1, 4));
    }
}
