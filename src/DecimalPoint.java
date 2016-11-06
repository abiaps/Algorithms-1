import java.text.DecimalFormat;

/**
 * Created by abiaps on 4/15/2016.
 */
public class DecimalPoint {
    public static void main(String[] args)
    {
        double d=16.5555;
        System.out.print(d);
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.print(df.format(d));

    }
}
