/**
 * Created by abiaps on 4/6/2016.
 */
public class Permutation {

    public static void permutation(String fix, String remains)
    {
        if(remains.equals(""))
            System.out.println(fix+remains);
        else
            for(int i=0;i<remains.length();i++)

                permutation(fix+remains.charAt(i),remains.substring(0,i)+remains.substring(i+1));

    }
    public static void main(String args[])
    {
        String input="123";
        permutation("",input);
    }
}
