
// User function Template for Java
public class EqualSumOfLeftAndRight {
    public static String equilibrium(int arr[]) 
    {
        for(int i=0; i<arr.length; i++)
        {
            int left=0;
            int right=0;
            for(int j=0;j<i;j++)
            {
                left+=arr[j];
            }
            for(int k=i+1; k<arr.length; k++)
            {
                right+=arr[k];
            }
            if(left==right) return "true";
        }
        return "false";
        
    }
}