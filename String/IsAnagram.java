import java.util.HashMap;
import java.util.Arrays;

public class IsAnagram
{ 
 public static boolean areAnagramsMap(String s, String t) 
    {
      
       if(s.length()!=t.length())return false;
       HashMap<Character,Integer> map=new HashMap<>();
       int len=s.length();
       for(int i=0; i<len; i++)
       {
          char c=s.charAt(i);
          if(map.containsKey(c))
          {
            int num=map.get(c);
            map.put(c,num+1);
          }
          else
          {
            map.put(c,1);
          }
       }
       for(int i=0; i<len;i++)
       {
          char c=t.charAt(i);

         if(map.containsKey(c))
         {
            if(map.get(c)>1)
            {
                map.put(c,map.get(c)-1);
            }
            else
            {
                map.remove(c);
            }

         }
         else
         {
            return false;
         }
       }
       if(map.isEmpty())return true;
       return false;
    
    }
    public static boolean isAnagramArrays(String s,String t)
    {
        if(s.length()!=t.length())
        return false;
        char ar1[]=s.toCharArray();
        char ar2[]=t.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return Arrays.equals(ar1,ar2);
    }

    
}
