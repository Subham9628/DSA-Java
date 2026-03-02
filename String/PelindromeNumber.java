

public class PelindromeNumber 
{
    public  boolean  pelindrome(int num)
    {
        num=Math.abs(num);
        int original=num;
        int reverse=0;
        while(num!=0)
        {
            int n=num%10;
            reverse=reverse*10+n;
            num/=10;
        }
        return original==reverse;
    }
}
