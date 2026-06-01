public class MaxTrapWater {
    public static int maxWater(int  arr[]) 
    {
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while(left<right)
        {
            int curr;
            if(arr[left]<=arr[right])
            {
                curr=left;
                while(left<right && arr[curr]>=arr[left] )
                {
                    sum+=arr[curr]-arr[left++];
                }
            }
            else
            {
                curr=right;
                while(left<right && arr[curr]>=arr[right]) 
                {
                    sum+=arr[curr]-arr[right--];
                }
            }
            
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(maxWater(new int[]{4,0,5,0,4,5}));
    }
}
