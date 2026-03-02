/*if number of  *># return positive value
  if number of #>* return negative value
  if #=* return 0  */

public class CheckValidString 
{
    public static int  checkValid(String str)
    {
        int count1=0 ,count2=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='#')count1++;
            if(str.charAt(i)=='*')count2++;
        }
        return Integer.compare(count2, count1);
    }
    public static void main(String[] args) 
    {
        // Enter any type of input
        System.out.println(checkValid("##*#*#*#*"));
    }
}
