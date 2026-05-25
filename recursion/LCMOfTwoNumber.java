public class LCMOfTwoNumber 
{
    public static int LCM(int a, int b)
    {
        return (a*b)/gcd(a,b);
    }
    private static int gcd(int a, int b)
    {
        if(a%b==0)
        {
            return b;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) 
    {
        System.out.println(LCM(20,25));
    }
}
