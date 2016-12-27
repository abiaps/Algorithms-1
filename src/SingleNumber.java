/**
 * Created by abiaps on 12/26/2016.
 */
public class SingleNumber {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'c', 'b', 'a', 'c'};
        char ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans ^= a[i];
            System.out.println(ans);
        }

    }
}
