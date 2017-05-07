import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by abiaps on 5/6/2017.
 */
public class KeyboardRow {
    public static void main(String[] args) {
        String[] in = {"Hello", "Alaska", "Dad", "Peace"};
        ArrayList<String> output = new ArrayList<String>();
        for (int k = 0; k < in.length; k++) {
            if (in[k].toLowerCase().matches("([asdfghjkl]*|[qwertyuiop]*|[zxcvbnm]*)"))
                output.add(in[k]);
        }
        System.out.println(output);
    }
}
