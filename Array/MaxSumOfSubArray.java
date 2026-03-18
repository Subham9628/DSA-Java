public class MaxSumOfSubArray 
{
    public static int maxSubArraySum(int arr[],int k)
    {// Using sliding windows 
        int max=0, sum=0;
        for(int i=0; i<k; i++)
        {
           sum+=arr[i];
        }
        max=sum;
        for(int i=k; i<arr.length; i++)
        {
           sum=sum+arr[i]-arr[i-k];
           if(max<sum)
           {
              max=sum;
           }
        }
        return max;
    }
}
