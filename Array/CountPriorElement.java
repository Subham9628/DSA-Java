public class CountPriorElement 
{

    // Time Complexity O(n^2)
    public static int countPriorWorst(int[] arr)
    {
       if(arr==null || arr.length==0)return 0;
       int count=1;
       for(int i=1; i<arr.length; i++)
       { 
        boolean flag=true;
        for(int j=i-1; j>=0; j--)
        {
           if(arr[i]<arr[j])
            {
                flag=false;
                break;
            }
        }
        if(flag)count++;
       }
       return count;
    }

    // Time Complexity O(n)
     public static int countPriorBest(int[] arr)
    {
       if(arr==null || arr.length==0)return 0;
       int count=1;int max=arr[0];
       for(int i=1; i<arr.length; i++)
       {
          if(arr[i]>max)
          {
            max=arr[i];
            count++;
          }
       }
       return count;
    }
 

    public static void main(String[] args) 
    {
        System.out.println(countPriorBest(new int[]{4,5,20,3,43,1,2}));
    }
}
