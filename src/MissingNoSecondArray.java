/**
 * Created by abiaps on 4/8/2016.
 */
public class MissingNoSecondArray {
    public static void main(String[] args)
    {
        int[] a={0,2,3,4};
        int[] b={2,0,3};
        int xor=0;
        for(int i:a)

           xor^=i;

        for(int j:b)

            xor^=j;
        System.out.println(xor);

    }
}
