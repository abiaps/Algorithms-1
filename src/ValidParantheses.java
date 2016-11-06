import java.util.Stack;

/**
 * Created by abiaps on 4/22/2016.
 */
public class ValidParantheses {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        if(s.length()%2!=0)
            return false;
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']')
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')'&&st.peek()!='('||s.charAt(i)==']'&&st.peek()!='['||s.charAt(i)=='}'&&st.peek()!='{')
                return false;
            else
                st.pop();
        }
        if(st.empty())
            return true;
        else
            return false;

    }
    public static void main(String[] args)
    {

        String input="({}){}";
        boolean check=isValid(input);
        if(check==true)
            System.out.println("valid parantheses");
        else
            System.out.println("invalid parantheses");

    }
}
