import java.util.ArrayList;
import java.util.HashMap;


/*
Dividing array into groups
Finding frequency using HashMap
Finding mode of each group
Adding all modal values having maximum frequency
*/

public class MaxTotalModeFrequency
{
   public static int totalModeFrequency(int arr[], int group)
   {
       if(group>arr.length)return -1;
       ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
       for(int i=0; i<group; i++)
       {
        int n=(int)Math.ceil((double)arr.length/group);
      
        ArrayList<Integer> list2=new ArrayList<>();
        for(int j=n*(i); j<n*(i+1); j++)
        {
            if(j<arr.length)
            {
                list2.add(arr[j]);
            }
        }
        if(!list2.isEmpty())
        {
            list1.add(list2);
        }
       }
       int score=0;
       for(ArrayList<Integer> list : list1 )
       {
           HashMap<Integer , Integer> map=new HashMap<>();
           // Calculate frequency of number 
           for(int n:list)
           {
              map.put(n,map.getOrDefault(n,0)+1);
           }
           int max=list.get(0);
           // Calculate mode of the group
           for(int key:map.keySet())
           {
              if(map.get(key)>map.get(max))
              {
                max=key;
              }
           }
           if(map.get(max)!=1)
           {
              for(int key:map.keySet())
              {
                 if(map.get(max)==map.get(key))
                 {
                    score+=key;
                    
                 }
              }
           }
       }
       return score;
   }
   public static void main(String args[])
   {
       int arr[]={3,3,5,5,5,7,7,8,3,4};
       System.out.println(totalModeFrequency(arr,3));
   }
}