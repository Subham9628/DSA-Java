import java.util.Arrays;

public class Merge_Sort
{
    public static void main(String[] args) 
    {
        int arr[]={3,4,1,2,3,9,0};
        divide(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void divide(int arr[], int start, int end)
    {
        if(end==1)
            {
                return ;
            }
        int mid=(end+start)/2;
        int left[]=new int[mid];
        int right[]=new int[end-mid];
        left=Arrays.copyOfRange(arr,start, mid);
        right=Arrays.copyOfRange(arr, mid, end);
        divide(left,0, mid);
        divide(right,0, end-mid);
        conquer(arr,left, right);
    }
    public static void conquer(int arr[],int left[], int right[])
    {
        int n=0,l=0,r=0;
        while(l<left.length && r<right.length)
        {
            if(left[l]<right[r])
            {
                arr[n++]=left[l++];
            }
            else
            {
                arr[n++]=right[r++];
            }
        }
        while(l<left.length)
        {
            arr[n++]=left[l++];
        }
        while(r<right.length)
        {
            arr[n++]=right[r++];
        }
    }
}