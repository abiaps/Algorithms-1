import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abiaps on 5/26/2016.
 */
public class IntersectionOfTwoArraysII {
    public static void intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> h2=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++)
            if (!h1.containsKey(nums1[i])) h1.put(Math.abs(nums1[i]), 1);
            else h1.put(Math.abs(nums1[i]), h1.get(Math.abs(nums1[i])) + 1);


        for(int j=0;j<nums2.length;j++)
            if (!h2.containsKey(nums2[j])) h2.put(Math.abs(nums2[j]), 1);
            else h2.put(Math.abs(nums2[j]), h2.get(Math.abs(nums2[j])) + 1);

        System.out.println(h1);
        System.out.println(h2);

        for(Map.Entry<Integer,Integer> m1:h1.entrySet())
            for(Map.Entry<Integer,Integer> m2: h2.entrySet())
                if (Math.abs(m1.getKey()) == Math.abs(m2.getKey()))
                {
                    int dif = (m1.getValue() < m2.getValue()) ? m1.getValue() : m2.getValue();
                    for (int q = 0; q < dif; q++) res.add(m1.getKey());
                }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] nums1 = {43, 85, 49, 2, 83, 2, 39, 99, 15, 70, 39, 27, 71, 3, 88, 5, 19, 5, 68, 34, 7, 41, 84, 2, 13, 85, 12, 54, 7, 9, 13, 19, 92};
        int[] nums2 = {10, 8, 53, 63, 58, 83, 26, 10, 58, 3, 61, 56, 55, 38, 81, 29, 69, 55, 86, 23, 91, 44, 9, 98, 41, 48, 41, 16, 42, 72, 6, 4, 2, 81, 42, 84, 4, 13};
        intersect(nums1, nums2);
    }
}
