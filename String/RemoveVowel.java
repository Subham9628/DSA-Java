public class RemoveVowel
{
    public static String removeVowels(String s) 
    {
        StringBuilder builder=new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if("aeiouAEIOU".indexOf(c)==-1)
            {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}