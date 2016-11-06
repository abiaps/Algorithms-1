import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 4/6/2016.
 */
public class FirstNonRepeatingChar {
    public static void main(String[] args)
    {
        String str="popog";
        int count=1;
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {

            if(!(h.containsKey(str.charAt(i))))
                h.put(str.charAt(i),count);
            else
                h.remove(str.charAt(i));

        }
        for(int j=0;j<str.length();j++)
        {
            if(h.containsKey(str.charAt(j))) {
                System.out.println(str.charAt(j));
                break;
            }
        }


    }
}
