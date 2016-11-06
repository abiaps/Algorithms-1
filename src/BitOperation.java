/**
 * Created by abiaps on 4/29/2016.
 */
public class BitOperation {
    public static void main(String[] args)
    {
        int x=37;
        int y=x^(x-1);
        if((y&1)==1)
        {
            y=y-1;
        }
        System.out.println("my method" +y);

        int z=x & (-x);
        System.out.println("genius method" +z);
    }
}
