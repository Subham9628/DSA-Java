class ValidateIP {
    public static boolean isValid(String s) 
    {
        String str[]=s.split("\\.",-1);
        if(str.length!=4)return false;
        
        for(int i=0; i<str.length; i++)
        {
            if(str[i].length()==0)return false;
            
            if(str[i].length()>1 && str[i].charAt(0)=='0')return false;
            try{
                 int num=Integer.valueOf(str[i]);
                 if(num>255 || num<0)
            {
                return false;
            }
            }
            catch(NumberFormatException e)
            {
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("192.168.32.1"));
    }
}