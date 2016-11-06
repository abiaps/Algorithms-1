import java.util.StringTokenizer;

/**
 * Created by abiaps on 4/6/2016.
 */
public class LongestPalindrome {
    public static void main(String[] args)
    {
        String input="madam teaches malayalam";

        int len=0;
        StringTokenizer st=new StringTokenizer(input," ");
        while(st.hasMoreTokens())
        {
            String str=st.nextToken();
            System.out.println(str);
            StringBuilder sb=new StringBuilder(str);
            String rev=sb.reverse().toString();
            if(str.equals(rev))
            {
                System.out.println(str+" is a palindrome ");
                if(str.length()>len)
                    len=str.length();
            }

        }
        System.out.println(len);

    }
}
