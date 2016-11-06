import java.util.ArrayList;

/**
 * Created by abiaps on 4/21/2016.
 */
public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1=(Math.abs(G)-Math.abs(E))*(Math.abs(F)-Math.abs(H));
        int area2=(Math.abs(C)-Math.abs(A))*(Math.abs(B)-Math.abs(D));
        int common=Math.abs(Math.min(C,G))*Math.abs(Math.min(H,D));
        if(C<E||D<H||E<A )
            return area1+area2;
        else
        return area1+area2-common;
    }
    public static void main()
    {
        ArrayList<Integer> a=new ArrayList<Integer>();

        int result=computeArea(-3,0,3,4,0,-1,9,2);
        System.out.print(result);
    }
}
