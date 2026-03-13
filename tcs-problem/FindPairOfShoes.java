import java.util.*;


public class FindPairOfShoes 
// input the String separated by space like a "2L 4R 4L 2R"
// the output becomes 2 pairs match first is 2L 2R and second 4R 4L
{
    public static int countPairsWorst(String str)
    {
        int count=0;
        String[] s=str.split(" ");
        List<String> list=new ArrayList<>(Arrays.asList(s));
        for(int i=0; i<list.size(); i++)
        {
            String sho=list.get(i);
           StringBuilder builder1=new StringBuilder(list.get(i));
           String s1=builder1.substring(builder1.length()-1, builder1.length());
    
           StringBuilder builder2=new StringBuilder(builder1.delete(builder1.length()-1,builder1.length()));
           String s2=builder2.toString()+(s1.equals("L")?"R":"L");
           if(list.contains(s2))
           {
               list.remove(sho);
               list.remove(s2);
               count++;
               i--;  // adjust index after removel
           }   
        }
        return count;
    }
    
}
