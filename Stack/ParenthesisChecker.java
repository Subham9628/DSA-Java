import java.util.Stack;

public class ParenthesisChecker
{
    public static boolean isBalanced(String s) 
    {
       Stack<Character> st=new Stack<>();
       for(int i=0; i<s.length(); i++)
       {
           if(s.charAt(i)=='['|| s.charAt(i)=='{' || s.charAt(i)=='(')
           {
               st.push(s.charAt(i));
           }
           else
           {
              if(!st.isEmpty())
              {
                 String str=st.peek()+""+s.charAt(i)+"";
              //   System.out.println(str);
                 if(str.equals("()")|| str.equals("{}")|| str.equals("[]"))
                 {
                     st.pop();
                 }
                 else
                 {
                    return false;
                 }
              }
              else
              {
                  return false;
              }
           }
           
       }
       if(st.isEmpty())
       {
           return true;
       }
       return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(isBalanced("{}[]({})"));
    }
}