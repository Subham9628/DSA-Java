import java.util.Stack;
public class BracketBalanceCost 
{
   public static void main(String[] args) 
   {
      System.out.println(getCost1("()()",2,3));
   }
   // First approach time O(n) and space O(n)
   public static int getCost1(String str, int open, int close)
   {
       Stack<Character> s=new Stack<>();
       if(str.length()==0)return 0;
       int openB=0, closeB=0;
       for(int i=0; i<str.length(); i++)
       {
           if(str.charAt(i)=='(')s.push(str.charAt(i));
           else 
           {
               if(str.charAt(i)==')' && !s.isEmpty()  && s.peek()=='(')s.pop();
               else s.push(str.charAt(i));
           }
       }
       for(char c:s)
       {
           if(c=='(')closeB++;
           else openB++;
       } 
       return openB*open + closeB*close;     
   }   
    
   // Second approach Time O(n) and space O(1)
    public static int getCost2(String str, int open, int close)
   {
       int unMatched=0;
       int balance=0;
       for(char c:str.toCharArray())
       {
           if(c=='(')balance++;
           else if(balance>0)
           {
              balance--;
           }
           else unMatched++;
       }
       int unBlanced=balance;
       return unMatched*open+unBlanced*close;
   }   

}
