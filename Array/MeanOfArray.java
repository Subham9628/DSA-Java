public class MeanOfArray 
{
  // mean =sum of array/ number of array
   public static String mean(int arr[])
   {
    // if array is null or not 
       if(arr==null || arr.length==0)return "";
       int total=0;
       // Add all element of array
       for(int num: arr)
       {
           total+=num;
       }
      // return mean of array
       double result= (double)total/arr.length;

       // formate of number on 2 decimal point
       return String.format("%.2f",result);
   }    
}
