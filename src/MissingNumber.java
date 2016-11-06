/**
 * Created by abiaps on 4/7/2016.
 */
public class MissingNumber {
    public static void main(String[] args)
    {
        int[] a = new int[100];
        for(int i=0;i<61;i++)

           a[i]=i+1;

        for(int j=62;j<99;j++)

            a[j]=j+1;

        for(int k=1;k<a.length;k++)
        {
            System.out.println(a[k]);
            if(a[k]!=(a[k-1]+1))
                System.out.println(k+" is missing");
        }
    }
}
