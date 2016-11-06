/**
 * Created by abiaps on 4/12/2016.
 */
public class RotateArray {
    public static void main(String[] args)
    {
        int[] ip={1,2,3,4,5,6,7};
        int[] result=new int[ip.length];
        int j=0;
        for(int i=ip.length-1;i>=0;i--)
        {
            result[j]=ip[i];
            j++;
        }
        for(int k=0;k<result.length;k++)
        System.out.println(result[k]);
    }
}
