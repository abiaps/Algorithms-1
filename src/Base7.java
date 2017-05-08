/**
 * Created by abiaps on 5/8/2017.
 */
public class Base7 {
    public static String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer();
        boolean flag = num < 0 ? true : false;
        num = Math.abs(num);
        while (num >= 7) {
            sb.insert(0, num % 7);
            num /= 7;
        }
        if (flag == true) sb.insert(0, -num % 7);
        else sb.insert(0, num % 7);
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 90;
        System.out.println(convertToBase7(num));
    }
}
