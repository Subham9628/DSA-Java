
import java.util.*;
public class MoveMultipleOfTenInEnd 
{
   /*
     Moving all the multiple of 10 end of array 
     without changing the order of array
   */    
   public static void main(String[] args) 
   {
      int arr[]={34,12,20,40,39,10,30,2,3,5,3};
      // output  34 12 39 2 3 5 3 20 40 10 30 
      moveMultipleInEnd(arr);
      System.out.println(Arrays.toString(arr));
   }
   public static void moveMultipleInEnd(int[] arr)// varags use 
   {
      if(arr==null || arr.length<=1)
        return ;
      List<Integer> list=new ArrayList<>();
      for(int i=0; i<arr.length;i++)
      {
        if(arr[i]%10!=0)
        {
            list.add(arr[i]);
        }
      }
      for(int i=0; i<arr.length;i++)
      {
        if(arr[i]%10==0)
        {
            list.add(arr[i]);
        }
      }
      int i=0;
      for(int num:list)
      {
         arr[i++]=num;
      }
      return ;
   }
}
