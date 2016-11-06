/**
 * Created by abiaps on 4/22/2016.
 */
public class ReverseBits {
    public static void reversebits(int n)
    {
        int result=0;
        for(int i=0;i<32;i++)
        {
            if((n&1)==1)
            {
                result+=1;
            }
            result<<=1;
            n>>=1;
        }
        System.out.print(result);
    }
    public static void main(String[] args)
    {
        int n=4 ;
        reversebits(n);
       // System.out.print(res);
    }
}
