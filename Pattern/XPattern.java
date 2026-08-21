public class XPattern 
{
   
    public static void main(String[] args) 
    {
        //Enter odd number
       int num=19;
       for(int i=0; i<num; i++)
       {
          for(int j=0; j<num; j++)
          {
           
            if(i==j || i+j==num-1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("  ");
            }
          }
          System.out.println();
       }
    }       
}
