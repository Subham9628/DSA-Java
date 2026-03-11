

public class ReverseArray
{
  public static void reverseBest(int arr[])
  {
    if(arr==null ||arr.length==1)
      return;
    int left=0,right=arr.length-1;
    while(left<right)
    {
        int temp=arr[right];
        arr[right--]=arr[left];
        arr[left++]=temp;
    }
  }
  public static int[]  reverseWorst(int... arr)// it is a varags declear
  {
     int arr1[]=new int[arr.length];
     int j=0;
     for(int i=arr.length-1; i>=0; i--)
     {
        arr1[j]=arr[i];
        j++;
     }
     return arr1;
  }
}
   
   
 
