/**
 * Created by abiaps on 4/18/2017.
 */
public class MaximumProductofWordLengths {
    public static int maxProduct(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String s1 = words[i];
                String s2 = words[j];

            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String[] input = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        maxProduct(input);

    }
}
