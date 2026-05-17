public class RaisedToPower 
{
    static long raisedToPower(int a, int b)
    {
      if(a<0)return -1;
      if(b==0)return 1;
      return a*raisedToPower(a, b-1);
    }
    public static void main(String[] args) {
        System.out.println(raisedToPower(5, 4));
    }
}
