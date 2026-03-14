import java.util.Scanner;
public class FindNthTermInSeries 
{
  /*
    consider the following series :1,1,2,3,4,9,8,27,16 .....
    This series is a mixture of two series  all the odd term  in this series forma geometric series and 
    all the even term of this series form other geometric series
    if find the 4 term  is 3 
    */ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find a term");
        int num=sc.nextInt();
        System.out.println(findTerm(num));
        sc.close();
    }
    public static  long findTerm(int num)
    {
        if(num%2==0)
        {
            return (long)Math.pow(3,num/2-1);
        }
        else
        {
            return (long)Math.pow(2,num/2);
        }
    }
       
   
}
