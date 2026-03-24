
public class RotateArrayKTimes 
{
   
    public static int[]  rotateArrayReturn(int[] a, int k)
    {
      int arr[]=a.clone();
      k=k%arr.length;
      if( arr.length==1 || k==0)
      {
        return arr;
      }
      while(k>0)
      {
        int num=arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=num;
        k--;
      }
    return arr;
    }
  
}


