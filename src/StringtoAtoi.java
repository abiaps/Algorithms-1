/**
 * Created by abiaps on 4/23/2016.
 */
public class StringtoAtoi {
    public static int atoi(String str) {
        if(str==null||str.length()==0)
            return 0;
        char sign='+';
        int i=0;
        double result=0;
        str = str.trim();
        if(str.charAt(0)=='-')
        {
            sign='-';
            i++;
        }
        else if (str.charAt(0) == '+') {
            i++;}


        while (i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9')
        {


            result=result*10+(str.charAt(i)-'0');
            i++;

        }

        if(sign=='-')

            result=-result;


        return (int)result;
    }
    public static void  main(String[] ars)
    {
        String in="-250";
        int resu=Integer.parseInt(in);
        int res=atoi(in);
        System.out.print(res);
        System.out.print(resu);
        //System.out.println(Integer.MIN_VALUE);
       // System.out.println(Integer.MAX_VALUE);
    }
}
