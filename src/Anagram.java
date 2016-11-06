import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 4/7/2016.
 */
public class Anagram {
    public static void main(String[] args)
    {
        String s1="most";
        String s2="most";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
            System.out.println("yes they are anagram");
        else
            System.out.println("no they are not an anagram");



    }
}
