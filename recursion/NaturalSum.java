public class NaturalSum 
{
    public static int find(int n) 
    {
       return sum(n,1,1);
    }
    private static int sum(int n, int sum, int count)
    {
        if(sum>=n)
        {
            if(sum==n)
            {
                return count;
            }
            else
            {
                return -1;
            }
        }
        return sum(n,sum+count+1, count+1);
    }
    public static void main(String[] args) 
    {
       System.out.println(find(10));    
    }
}
    

