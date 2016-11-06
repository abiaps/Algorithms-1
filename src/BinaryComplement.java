/**
 * Created by abiaps on 4/9/2016.
 */
public class BinaryComplement {
    public static void main(String[] args)
    {
        int n=13;
        String str=Integer.toBinaryString(n);
        System.out.println(str);
        char[] ch=str.toCharArray();
        String res="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0') {
             //   ch[i] = '1';
                res += '1';
            }
            else
                res+='0';
        }
        for(int j=0;j<ch.length;j++)
        {
            System.out.println(ch[j]);
        }
        System.out.println(res);
        int base=2;
        int result=Integer.parseInt(res,base);
        System.out.println(result);


    }
}
