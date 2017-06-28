/**
 * Created by abiaps on 6/28/2017.
 */
public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] input = s.split("\\s+");
        for (int i = 0; i < input.length; i++) {
            StringBuilder sb = new StringBuilder(input[i]);
            result.append(" " + sb.reverse());
        }
        return result.substring(1).toString();
    }

    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        System.out.println(reverseWords(input));
    }
}
