public class FibonacciNumber 
{
    public static void main(String[] args) 
    {
        System.out.println(fib1(4));
    }
    //Solve through Dynamc programming 
    // Using Memoization Top-Down DP
    public static int fib1(int n)
    {
        int dp[]=new int[n+1];
        return fibo1(n,dp);
    }
    private static int fibo1(int n, int dp[])
    {
        if(n<=1)return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]=fibo1(n-1,dp)+fibo1(n-2,dp);
    }
    //Tabulation Buttom Up DP
    public static int fib2(int n)
    {
       int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
       for(int i=2; i<dp.length;i++)
       {
          dp[i]=dp[i-1]+dp[i-2];
       }
       return dp[n];

    }
}
