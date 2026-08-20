/*  You can start any index of array move to left cyclic 
    and calculate the xor from  start to end of number 
    then find maximum xor from the array
    example -> [2,3,4,3,4,5] 
    you can calculate the xor from start any index like 
    i start fro index =3  i create a new array arr[3,4,3,2,5,4]then calculate the xor 3+3^4+364^3 and so on 
    you can get the maximum from start any index 
*/


public class MaxCyclicXor 
{
    static int  max=Integer.MIN_VALUE;
    public static void main(String[] args) 
    {
        int arr[]={7,8,5,5,9,2,2,0,1,6};
        maxXor(arr,0);
        System.out.println(max);
    }
    private static void maxXor(int arr[],int idx)
    {
       if(idx==arr.length)return ;
       int sum=0;int n=0;
       for(int i=idx;i>=0;i--)
       {
          n=n^arr[i];
          sum+=n;
       }
       for(int i=arr.length-1;i>idx;i--)
       {
          n=n^arr[i];
          sum+=n;
       }
       if(sum>max)max=sum;
       maxXor(arr,idx+1);
       return ;
    }
}
