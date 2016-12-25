import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abiaps on 12/25/2016.
 */
public class FirstUniqueCharIndex {
    public static void main(String[] args) {
        System.out.print("Enter the string.");
        String s = new Scanner(System.in).next();
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!h.containsKey(s.charAt(i)))
                h.put(s.charAt(i), 1);
            else {
                int val = h.get(s.charAt(i));
                h.put(s.charAt(i), ++val);
            }

        }
        int min_ind = 0, flag = 0;
        if (!h.containsValue(1))
            System.out.println("no unique char index");
        else {
            for (Map.Entry<Character, Integer> m : h.entrySet()) {
                if (m.getValue() == 1) {
                    if (flag == 0) {
                        min_ind = s.indexOf(m.getKey());
                        flag = 1;
                    }
                    if (min_ind > s.indexOf(m.getKey()))
                        min_ind = s.indexOf(m.getKey());

                }
            }
            System.out.println(min_ind);
        }
    }
}
