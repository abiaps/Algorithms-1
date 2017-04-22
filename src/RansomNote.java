import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 1/21/2017.
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransom = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mag = new HashMap<Character, Integer>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!ransom.containsKey(ransomNote.charAt(i)))
                ransom.put(ransomNote.charAt(i), 1);
            else
                ransom.put(ransomNote.charAt(i), ransom.get(ransomNote.charAt(i)) + 1);
        }
        for (int j = 0; j < magazine.length(); j++) {
            if (!mag.containsKey(magazine.charAt(j)))
                mag.put(magazine.charAt(j), 1);
            else
                mag.put(magazine.charAt(j), mag.get(magazine.charAt(j)) + 1);
        }
        for (Map.Entry<Character, Integer> m : ransom.entrySet()) {
            if (mag.containsKey(m.getKey())) {
                if (m.getValue() > mag.get(m.getKey()))
                    return false;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
    }
}
