import java.util.Arrays;

public class Sort012 {
    public static void sort012(int[] arr) 
    {
       int zero=0;
       int one=0;
       int two=0;
       for(int i=0; i<arr.length; i++)
       {
           if(arr[i]==0) zero++;
           else
           {
               if(arr[i]==1)one++;
               else two++;
           }
       }
       int k=0;
       for(int i=0; i<zero; i++)
       {
           arr[k++]=0;
       }
       for(int i=0; i<one; i++)
       {
           arr[k++]=1;
       }
       for(int i=0; i<two; i++)
       {
           arr[k++]=2;
       }
    }
    public static void main(String[] args) 
    {
        int arr[]={2,1,1,0,0,1,2,2,0,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}