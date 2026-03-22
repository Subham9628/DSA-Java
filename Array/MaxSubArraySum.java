public class MaxSubArraySum 
{
    // Using kadane's algorithm 
    public static int maxSubArraySum(int[] arr)
    {
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
           sum+=arr[i];
           sum=Math.max(sum,arr[i]);
           maximum=Math.max(sum,maximum);
        }
        return maximum;
    }
}
