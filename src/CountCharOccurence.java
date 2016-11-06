/**
 * Created by abiaps on 4/7/2016.
 */
public class CountCharOccurence {
    public static void countOccur(String in,char ch)
    {
        int count=0;
        for(int i=0;i<in.length();i++)
        {
            if(ch==in.charAt(i))
                count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        String str="happyyoy";
        countOccur(str,'y');
    }
}
