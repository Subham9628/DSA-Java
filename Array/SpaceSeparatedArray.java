import java.util.Scanner;
public class SpaceSeparatedArray
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr1[]=s.split(" ");
        int arr2[]=new int[arr1.length];
        for(int i=0; i<arr1.length; i++)
        {
            arr2[i]=Integer.valueOf(arr1[i]);
        }
        for(int num:arr2)
        {
            System.out.print(num+" ");
        }
        sc.close();
    }
}