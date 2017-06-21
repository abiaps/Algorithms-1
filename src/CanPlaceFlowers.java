/**
 * Created by abiaps on 6/20/2017.
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) return true;
        if (flowerbed.length > 1)
            while (n > 0 && i < flowerbed.length) {
                if ((flowerbed[i] == 0 && i == 0 && flowerbed[i + 1] == 0) || (flowerbed[i] == 0 && i == flowerbed.length - 1 && flowerbed[i - 1] == 0)) {
                    n--;
                    flowerbed[i] = 1;
                } else if (i > 0 && i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
                i++;
            }
        if (n > 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] flowerinput = {1, 0, 0, 0, 0, 1};
        System.out.print(canPlaceFlowers(flowerinput, 2));
    }
}
