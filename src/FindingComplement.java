/**
 * Created by abiaps on 1/13/2017.
 */
public class FindingComplement {
    public static int findComplement(int num) {
        if (num == 0) return 1;
        else if (num == 1) return 0;
        StringBuffer sb = new StringBuffer();
        int sum = 0, j = 0;
        while (num >= 1) {
            if ((num & 1) % 10 == 0) sb.insert(0, '1');
            else sb.insert(0, '0');
            num = num >> 1;
        }
        String s = sb.toString();
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == '1')
                sum += Math.pow(2, j);
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(findComplement(5));
    }
}
