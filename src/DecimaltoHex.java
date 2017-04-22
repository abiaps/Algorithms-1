/**
 * Created by abiaps on 2/12/2017.
 */
public class DecimaltoHex {
    public static String toHex(int num) {
       /* char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer sb = new StringBuffer();
        long n=num&0x00000000ffffffffL;
        while (n > 0) {
            sb.insert(0, c[(int)(n % 16)]);
            n /= 16;
        }
        return num == 0 ? "0" : sb.toString();*/
        if (num == 0) return "0";
        char[] map = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.insert(0, map[num & 0b1111]);
            num = num >>> 4;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // System.out.print(Long.parseLong(Long.toBinaryString(-1)));
        System.out.println(toHex(-1));

    }
}
