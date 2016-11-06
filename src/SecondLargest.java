/**
 * Created by abiaps on 4/8/2016.
 */
public class SecondLargest {
    public static void main(String[] args)
    {
        int[] n={1,5,8,6,9,7,9};
        int highest=0;
        int secondhighest=0;
        for(int i:n)
        {
            if(i>highest)
            {
                secondhighest=highest;
                highest=i;
            }
            else if(i>secondhighest&&i!=highest)
                secondhighest=i;
        }
        System.out.println(secondhighest);
    }
}
