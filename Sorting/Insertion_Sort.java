import java.util.Arrays;

public class Insertion_Sort 
{
    public static void main(String[] args) 
    {
        int arr[]={4,2,6,3,5,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
           for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            } 
        }
    }
}
