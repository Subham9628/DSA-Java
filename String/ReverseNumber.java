
public class ReverseNumber 
{
    public int reverse(int num)
    {
        num=Math.abs(num);
        int reverse=0;
        while(num!=0)
        {
            int n=num%10;
            reverse=reverse*10+n;
            num/=10;
        }
        return reverse;
    }
}
