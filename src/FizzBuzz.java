import java.util.ArrayList;
import java.util.List;

/**
 * Created by abiaps on 1/9/2017.
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                res.add("FizzBuzz");
            else if (i % 3 == 0)
                res.add("Fizz");
            else if (i % 5 == 0)
                res.add("Buzz");
            else
                res.add(String.valueOf(i));
        }
        return res;
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.print(fizzBuzz(n));
    }
}
