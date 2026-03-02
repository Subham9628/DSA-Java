import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(reader.readLine());
        double n1=Double.parseDouble(reader.readLine());
        String s=reader.readLine();
        System.out.println(s);
        System.out.println(n1);
        System.out.println(num);
    }
   
}
