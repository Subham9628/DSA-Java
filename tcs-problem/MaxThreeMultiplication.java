import java.util.Arrays;
public class MaxThreeMultiplication 
{
    // find the maximum three value multiplication in array
   public static int maxThreeMul(int []arr)
   {
    if(arr==null || arr.length<=2) return -1;
       Arrays.sort(arr);
       int len=arr.length-1;
       int max1=arr[len]*arr[len-1]*arr[len-2];
       int max2=arr[0]*arr[1]*arr[len];
       if(max1>max2)return max1;
       return max2;
   }    
}
