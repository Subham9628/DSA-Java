import java.util.*;
public class IsSubset {
    public static boolean isSubset(int a[], int b[]) 
    {
       Map<Integer,Integer> map=new HashMap<>();
       for(int num:a)
       {
           map.put(num,map.getOrDefault(num,0)+1);
       }
       for(int num:b)
       {
           if(!map.containsKey(num))
           {
               return false;
           }
           int n=map.get(num);
           if(n==1)
           {
               map.remove(num);
           }
           else
           {
               map.put(num,map.get(num)-1);
           }
       }
       return true;
    }
}

