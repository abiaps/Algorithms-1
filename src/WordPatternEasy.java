import java.util.HashMap;


/**
 * Created by abiaps on 4/17/2016.
 */
public class WordPatternEasy {
    public static void main(String[] args)
    {
        String pattern="abba";
        String str="dog cat cat dog";
        String[] curstr= str.split(" ");
        HashMap<Character,String> h=new HashMap<Character,String>();

            int i=0;int flag=0;
            while(i<pattern.length())
            {
                if((!h.containsKey(pattern.charAt(i)))&&(!h.containsValue(curstr[i])))
                {
                    h.put(pattern.charAt(i),curstr[i]);

                }

                i++;
            }


  //  System.out.println(h);


           /* for(int m=0;m<curstr.length;m++) {
                if (curstr[m] != h.get(pattern.charAt(m))) {
                    System.out.println(curstr[m]);
                    System.out.println(pattern.charAt(m));
                    System.out.println(h.get(pattern.charAt(m)));
                    flag = 1;
                    break;
                }
            }*/
             for(int j=0;j<curstr.length;j++)
             {
                 if(!(curstr[j].equals(h.get(pattern.charAt(j)))))
                 {

                     break;
                 }
             }
        if(flag==1)
        System.out.println("false");
        else
            System.out.println("true");
    }
}
