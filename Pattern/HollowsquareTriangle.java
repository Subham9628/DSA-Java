 public class HollowsquareTriangle {
 
    
 
    public static void main(String []args)
{
       int num=5;
       int n1=(int)Math.floor(num/2-1);
       for(int i=0; i<n1; i++)
       {
           for(int j=0; j<(num+2); j++)
           {
               System.out.print("  ");
           }
           for(int k=0; k<=n1-i;k++)
           {
               System.out.print("  ");
           }
           for(int k=0; k<i*2+1; k++)
           {
               System.out.print("* ");
           }
           System.out.println();
           
           
           
       }
       for(int i=0; i<2; i++)
       {
           System.out.print("e"+" ");
           for(int j=0; j<num+1; j++)
           {
              System.out.print("  "); 
           }
           for(int j=0; j<(num-2)+i*2; j++)
           {
           if(i==0)
           {
               if(j==0)
               {
                   System.out.print("  ");
               }
               System.out.print("*"+" ");
           }
           else
           {
             System.out.print("*"+" ");
           }
           }
           System.out.println();
           
       }
       for(int i=0; i<num; i++)
       {
           for(int j=0; j<num+3; j++)
           {
               if(i==num-1)
               {
                   System.out.print("e"+" ");
                   continue;
               }
               if(i==0 && j==num  || i==1 && j==num)
               {
                   System.out.print("  ");
                   
                   for(int k=0; k<num; k++)
                   {
                       for(int l=0; l<num; l++)
                       {
                           
                       }
                   }
                   continue;
               }
               if(j==0 || j==num+2)
               {
                   System.out.print("e"+" ");
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