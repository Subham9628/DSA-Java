/**
  You are given a String type number and character digit find the maximum number  after remove the given digit at once 
  example 
   I/P "1232341"
       '1'
    o/p  232341
 */
public class RemoveDigit 
{
    public static void main(String[] args) {
        int num=getInteger("2122312", '1');
        System.out.println(num);
    }   
    public static int getInteger(String number, char digit)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<number.length(); i++)
        {
            if(number.charAt(i)==digit)
            {
               String s=number.substring(0, i)+number.substring(i+1);
               if(max<Integer.valueOf(s))max=Integer.valueOf(s);
            }
        }
        return max!=Integer.MIN_VALUE?max:Integer.valueOf(number);
    } 
}