/**
 * Created by abiaps on 4/9/2016.
 */
public class Add2IntWithoutArithmetic {
    public static void main(String[] args)
    {
        int a=32;
        int b=99;
        while(b!=0)
        {
            int carry=a&b;
            a^=b;
            b=carry<<1;
        }
        System.out.println(a);
    }
}
