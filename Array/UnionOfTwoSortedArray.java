import java.util.*;
public class UnionOfTwoSortedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) 
    {
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:a)
        {
            set.add(num);
        }
        for(int num:b)
        {
            set.add(num);
        }
        for(int num:set)
        {
            list.add(num);
        }
        return list;
        
    }
}
