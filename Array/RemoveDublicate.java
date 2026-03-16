import java.util.*;

public class RemoveDublicate 
{
    // Remove all dublicate element from sorted array
    public static int[] removeDublicateWorst(int arr[])
    {
        if(arr==null || arr.length<=1) return arr;
        ArrayList<Integer> list=new ArrayList<>();  
        // Copy array element in list      
        for(int i=0; i<arr.length; i++)
        {
            list.add(arr[i]);
        }
        //int first=arr[0];
        for(int i=0; i<list.size()-1; i++)
        {
           if(list.get(i)==list.get(i+1))
           {
              list.remove(i+1);
              i--;
           }
        }
        int arr1[]=new int[list.size()];
        // copy arraylist in existing array
        for(int i=0; i<list.size(); i++)
        {
            arr1[i]=list.get(i);
        }
        return arr1;
    }

    // more optimize solution
     public static int[] removeDublicateBest(int arr[])
    {
        if(arr==null || arr.length<=1) return arr;
        int j=0;   
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]!=arr[j])
            {
                arr[j++]=arr[i];
            }
        }
        return Arrays.copyOf(arr, j+1);
    }
}
