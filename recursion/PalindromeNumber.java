public class PalindromeNumber 
{ 
    
     public static boolean palindrome(int num)
     {
         return num==reverse(num,0);
     }
     private static int reverse(int num ,int reverse)
     {
        if(num==0)
        {
            return reverse ;
        }
        reverse=reverse*10+num%10;
        return reverse(num/10,reverse);
     }
     public static void main(String[] args) 
     {
        System.out.println(palindrome(431));// false  
     }
}
