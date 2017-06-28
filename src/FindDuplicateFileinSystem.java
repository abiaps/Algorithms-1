import java.util.*;

/**
 * Created by abiaps on 6/27/2017.
 */
public class FindDuplicateFileinSystem {
    public static List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> h = new HashMap<String, List<String>>();
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> arr;
        for (int i = 0; i < paths.length; i++) {
            String[] st = paths[i].split("\\s+");
            String key = st[0];
            for (int j = 1; j < st.length; j++) {
                String file = st[j];
                String content = file.substring(file.indexOf('(') + 1, file.indexOf(')'));
                String prefix = file.substring(0, file.indexOf('('));
                if (!h.containsKey(content)) {
                    arr = new ArrayList<String>();
                    arr.add(key + "/" + prefix);
                    h.put(content, arr);
                } else {
                    arr = h.get(content);
                    arr.add(key + "/" + prefix);
                }

            }
        }
        for (Map.Entry<String, List<String>> m : h.entrySet()) {
            if (m.getValue().size() > 1) {
                result.add(m.getValue());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        System.out.println(findDuplicate(input));
    }
}
