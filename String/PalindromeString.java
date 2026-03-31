

public class PalindromeString 
{
    public static boolean  palindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(right)!=str.charAt(left))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
