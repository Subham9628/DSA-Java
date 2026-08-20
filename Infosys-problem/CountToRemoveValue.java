import java.util.Arrays;


/* count the minimum remove value from the array
  at remove time follows these two condition 
  1. if X and Y is difference X!=Y remove both value and count++;
  2. ifX==Y the remove Y increase the count 
*/
public class CountToRemoveValue 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,1,3,5};
        int count=removeValue(arr);
        System.out.println(count);
    }
    private static int removeValue(int arr[])
    {
        Arrays.sort(arr);
        int count=0,left=0,right=arr.length-1;
        while(left<=right)
        {
            if(arr[left]!=arr[right])
            {
                left++;
                right--;
            }
            else
            {
                left++;
                
            }
            count++;
        }  
        return count;
    }
}
