import java.util.*;
public class PrimeCieve
{
    public static int[] primeCeive(int num)
    {
        ArrayList<Boolean> list=new ArrayList<>(Collections.nCopies(num,true));
        int start=2, end=num;
        for(int i=2;i<=num; i++)
        {
            boolean is_prime=true;
            for(int j=i;j<=num; j++)
            {
                if(j%2==0)list.add(j-1,false);
            }
        }
    }
}