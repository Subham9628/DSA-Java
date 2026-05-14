import java.util.Arrays;
public class MaxProductOfThreeNumber 
{
    public static int maxProduct(int arr[])
    {
        if(arr.length<3)
        {
            return -1;
        }
        Arrays.sort(arr);
        int len=arr.length;
        return Math.max(arr[0]*arr[1]*arr[arr.length-1],arr[len-1]*arr[len-2]*arr[len-3]);
    }
}
