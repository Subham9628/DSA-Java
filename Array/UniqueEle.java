import java.util.ArrayList;
import java.util.HashMap;
public class UniqueEle{

       // Time  complexity O(n^2)

    public static ArrayList<Integer>  uniqueValue(int []a)
    {
       ArrayList<Integer> b=new ArrayList<>();
       for(int i=0; i<a.length; i++)
       {
         boolean isDublicate=false;
         for(int j=0; j<a.length;j++)
         {
            if(i!=j && a[i]==a[j])
            {
               isDublicate=true;
               break;
            }
         }
         if(!isDublicate)
         {
            b.add(a[i]);
         }
       } 
        return b;
    }
    // Time  complexity O(n)
    public static ArrayList<Integer>  uniqueValueMap(int []a)
    {
       ArrayList<Integer> b=new ArrayList<>();
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int i=0; i<a.length; i++)
       {
          if(map.containsKey(a[i]))
          {
            map.put(a[i],map.get(a[i])+1);
          }
          else
          {
            map.put(a[i],1);
          }
       }
       for(Integer key: map.keySet())
       {
        if(map.get(key)==1)
        {
            b.add(key);
        }
       }
        return b;
    }
}
