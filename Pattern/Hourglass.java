public class Hourglass
{
    public static void main(String[] args)
    {
        //Enter odd number
        int num=9;
        for(int i=0; i<num/2+1; i++)
        {
            for(int j=0; j<num; j++)
            {
                if(j<i || j>num-i-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for(int i=num/2; i>0; i--)
        {
            for(int j=0; j<num; j++)
            {
               if( j<i-1 || j>num-i)
               {
                 System.out.print(" ");
               }
               else
               {
                System.out.print("*");
               }
            }
            System.out.println();
        }
    }
}