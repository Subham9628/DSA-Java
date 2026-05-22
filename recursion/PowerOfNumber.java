public class PowerOfNumber 
{
    public static int reverseExponentiation(int n) 
    {
         int reverse=reverse(n,0);
         return power(n,reverse);
    }
    private static int reverse(int n,int sum)
    {
        if(n==0)
        {
            return sum; 
        }
        return reverse(n/10,sum*10+n%10);
    }
    private static int power(int n, int reverse)
    {
        if(reverse==0)
        {
            return 1;
        }
        int half=power(n, reverse/2);
        if(reverse%2==0)
        {
            return half*half;
        }
        return  n*half*half;
    }
    public static void main(String[] args) 
    {
        System.out.println(reverseExponentiation(20));
    }
}


