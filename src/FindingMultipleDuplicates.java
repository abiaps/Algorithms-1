import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 4/8/2016.
 */
public class FindingMultipleDuplicates {
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int[] n={1,2,2,6,5,5,8,10};
       /* for(int i=0;i<100;i++)
        {
            n[i]=i+1;
        }*/
        for(int j=0;j<n.length;j++)
        {
            int num=n[j];
            Integer count=h.get(num);
            h.put(num,count==null ? 1:count+1);
        }
        for(Map.Entry<Integer, Integer> entry:h.entrySet())
        {
            System.out.println("The number "+entry.getKey()+" comes "+entry.getValue()+"times ");
        }
    }
}
