public class Butterfly
{
    public static void main(String[] args) 
    {
        //given the odd number 
        int num=3;
        for(int i=0; i<num; i++)
        {
           for(int j=0; j<=i; j++)
           {
               System.out.print("* ");
           }
           for(int j=(num-i-1)*2; j>0; j--)
           {
               System.out.print("  ");
           }
           for(int j=i; j>=0; j--)
           {
               System.out.print("* ");
           }
           System.err.println();
        }
        num=num-1;
        for(int i=0; i<num; i++)
        {
           for(int j=i; j<num; j++)
           {
               System.out.print("* ");
           }
           for(int j=i*2+2; j>0; j--)
           {
               System.out.print("  ");
           }
           for(int j=i; j<num; j++)
           {
               System.out.print("* ");
           }
           System.err.println();
        }
        
    }

}
