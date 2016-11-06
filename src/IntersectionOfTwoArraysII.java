import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 5/26/2016.
 */
public class IntersectionOfTwoArraysII {
    public static void intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> numsAL1 = new ArrayList<Integer>();
        ArrayList<Integer> numsAL2 = new ArrayList<Integer>();
        int flag = 0;

        HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> h2=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!h1.containsKey(nums1[i]))
            h1.put(nums1[i],1);
            if(h1.containsKey(nums1[i]))
            {
                h1.put(nums1[i],h1.get(nums1[i])+1);
            }
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(!h2.containsKey(nums2[j]))
            h2.put(nums2[j],1);
            if(h2.containsKey(nums2[j]))
            {
                h2.put(nums2[j],h2.get(nums2[j])+1);
            }
        }
        System.out.println(h1);
        System.out.println(h2);
        int dif=-1;
        int min=0;

        for(Map.Entry<Integer,Integer> m1:h1.entrySet())
        {
            for(Map.Entry<Integer,Integer> m2: h2.entrySet())
            {
                if(m1.getKey()==m2.getKey())
                {
                    dif=m1.getValue()-m2.getValue();
                    if(dif==0)
                    {
                        for(int p=0;p<m1.getValue();p++)
                        {
                            res.add(m1.getKey());
                        }
                    }
                    else if(dif>0)
                    {
                        min=Math.min(m1.getValue(),m2.getValue());
                        for(int q=0;q<min;q++)
                        {
                            res.add(m1.getKey());
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 1,3,4,6};
        int[] nums2 = {2, 2,1,1,1,3,3,5};
        intersect(nums1, nums2);
    }
}
