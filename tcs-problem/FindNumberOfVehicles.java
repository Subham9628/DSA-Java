import java.util.Scanner;

public class FindNumberOfVehicles 
{ 
    // user enter the number of wheels and number of vehicle 
    // find how many number of two wheeler and four wheeler manufacturing by company
    // if vehicle and wheels not correct pair of two and four wheeler then give the -1 result
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of wheels and vehicles");
        Scanner sc=new Scanner(System.in);
        int wheels=sc.nextInt();
        int vehicle=sc.nextInt();
        countVehicle(vehicle, wheels);
        sc.close();
    }
    public static void countVehicle(int vehicle, int wheels)
    {
        if(wheels%2!=0 || wheels<2*vehicle ||wheels>4*vehicle )
        {
            System.out.println(-1);
            return ;
        }
        int  twow=(4*vehicle-wheels)/2;
        int  fourw=(wheels-2*vehicle)/2;
        System.out.print("Number of two wheels is :"+twow + " and number of four wheelers is :"+fourw);
        
    }
}
