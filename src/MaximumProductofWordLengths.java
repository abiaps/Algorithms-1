import java.util.Arrays;

/**
 * Created by abiaps on 4/18/2017.
 */
public class MaximumProductofWordLengths {
    public static int maxProduct(String[] words) {
        if (words.length == 0) return 0;
        int maxLen = 0;
        int[] binaryEquivalentWord = new int[words.length];
        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                binaryEquivalentWord[i] |= 1 << (c - 'a');
            }
        }
        for (int p = 0; p < words.length; p++) {
            for (int q = p + 1; q < words.length; q++) {
                if ((binaryEquivalentWord[p] & binaryEquivalentWord[q]) == 0)
                    maxLen = Math.max(maxLen, words[p].length() * words[q].length());
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String[] input = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.print(maxProduct(input));
    }
}
