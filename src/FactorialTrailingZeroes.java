import java.math.BigInteger;

/**
 * Created by abiaps on 12/22/2016.
 */
public class FactorialTrailingZeroes {
    private static int c1 = 0;

    public static void main(String args[]) {
        int n = 10;
        int res = trailingZeroes(n);
        System.out.println("no.of trailing zeroes " + res);
    }

    public static int trailingZeroes(int n) {
        /*BigInteger fact=findFactorial(n);
        System.out.print("factorial of "+n+"is "+fact);
        String s=fact.toString();
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='0')
                count++;
            else
                break;
        }
        return count ;
    }
    private static BigInteger findFactorial(int num)
    {
        BigInteger fact=BigInteger.valueOf(num);
       while (num!=1)
       {
           num=num-1;
          fact=fact.multiply(BigInteger.valueOf(num));

       }
       return fact;

    }*/

        for (int i = 5; (n / i) >= 1; i *= 5)
            c1 += n / i;

        return c1;
    }
}
