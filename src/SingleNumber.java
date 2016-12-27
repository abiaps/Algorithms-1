/**
 * Created by abiaps on 12/26/2016.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 2, 1, 4, 5};
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans ^= a[i];
            System.out.println(ans);
        }

    }
}
