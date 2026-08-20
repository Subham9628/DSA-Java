/**
   YOu are given size of the array and the value of array your task to find the minimum swap to set the even value 
   on one side and odd value on the other side 
 */
public class CountMinSwap 
{
    public static void main(String[] args) 
    {
        int count=countSwap(new int[]{1,2,3,4,5,6});
        System.out.println(count);
    }
    public static int countSwap(int arr[])
    {
        int count=0;
        int left=0,right=arr.length-1;
        while(left<right)
        {
            if(arr[left]%2==0)
            {
                left++;
            }
            else
            {
                if(arr[right]%2==1)
                {
                    right--;
                }
                else
                {
                    int temp=arr[left];
                    arr[left++]=arr[right];
                    arr[right--]=temp;
                    count++;
                }
            }
        }
        return count;
    }
}
