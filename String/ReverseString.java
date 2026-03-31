
public class ReverseString 
{
    public static String reverse(String str)
    {
        int left =0; int right=str.length()-1;
        char[] arr=str.toCharArray();
        while(left<right)
        {
            char temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
        return new String(arr);
    }
}
