import java.util.Scanner;

public class RaisedToPower 
{
    static long raisedToPower(int a, int b)
    {
      if(a<0)return -1;
      if(b==0)return 1;
      return a*raisedToPower(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base Number:");
        int base=sc.nextInt();
        System.out.println("Enter Exponent Number:");
        int exp=sc.nextInt();
        System.out.println();
        System.out.println(raisedToPower(base,exp));
        sc.close();
    }
}
