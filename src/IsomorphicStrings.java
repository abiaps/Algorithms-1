import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 4/13/2016.
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        if(s.equals(t))
            return true;
        HashMap<Character, Character> h = new HashMap<Character, Character>();
        int flag = 0;
        for (int i = 0; i < s.length(); i++)

            if ((!h.containsKey(s.charAt(i))) && (!h.containsValue(t.charAt(i))))

                h.put(s.charAt(i), t.charAt(i));

        for (int j = 0; j < s.length(); j++){

            if ((!h.containsKey(s.charAt(j))) || (h.get(s.charAt(j)) != t.charAt(j)) )
            {
                flag = 1;
                break;
            }

        }
        if(flag==0)
            return true;

        else
            return false;
    }
    public static void main(String[] args)
    {
        String s1="ab";
        String s2="aa";
        boolean status=isIsomorphic(s1,s2);
        if(status==true)
            System.out.println("They are isomorphic");
        else
            System.out.println("They are not isomorphic");
    }
}
