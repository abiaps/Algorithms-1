/**
 * Created by abiaps on 4/8/2016.
 */
public class LargestandSmallest {
    public static void main(String[] args)
    {
        int n[]={3,5,8,9,6,55,88,74};
        int smallest=n[0];
        int largest=n[0];
        for(int i=1;i<n.length;i++)
        {
            if(n[i]<smallest)
                smallest=n[i];
            else if(n[i]>largest)
                largest=n[i];
        }
        System.out.println("The smallest and largest are "+smallest+" and "+largest+" respectively");
    }
}
