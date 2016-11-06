import java.util.Arrays;

/**
 * Created by abiaps on 4/8/2016.
 */
public class SumEqualsGivenNo {
    public static void main(String[] args)
    {
        int[] num={15,2,6,5,4,9};
        int givenno=11;
        Arrays.sort(num);
        int i=0,j=num.length-1;
        while(i<j)
        {
            if(num[i]+num[j]==givenno)
            {
                System.out.println("The no.s "+num[i] +num[j]+"add to this givenno"+givenno);
                i++;
                j--;
            }
            else if(num[i]+num[j]<givenno)
                i++;
            else
                j--;
        }
    }
}
