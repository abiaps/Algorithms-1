import java.util.Scanner;
import java.util.Stack;

/**
 * Created by abiaps on 4/10/2016.
 */
public class BalancingBraces {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(')
                stack.push(str.charAt(i));
            if(str.charAt(i)=='}'&&stack.peek()=='{'||str.charAt(i)==']'&&stack.peek()=='['||str.charAt(i)==')'&&stack.peek()=='(')
                stack.pop();
            else if(stack.empty())
                System.out.println("NO");
        }
        System.out.println("YES");

    }
}
