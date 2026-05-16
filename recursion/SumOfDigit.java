public class SumOfDigit 
{
     public static int sum(int arr[])
     {
         int n=0;
         return sum(arr, n);
     }
     public static int sum(int arr[],int n)
     {
        if(arr.length==0)return 0;
        if(n==arr.length-1)
        {
           return arr[n];
        }
        return arr[n]+sum(arr,n+1);
     }
     public static void main(String[] args) 
     {
        int arr[]={4,5,6,3,45,3,4};
        System.out.println(sum(arr));       
     }
}
