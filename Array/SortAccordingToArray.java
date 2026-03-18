import java.util.*;
public class SortAccordingToArray {

    static void relativeSort(int[] a1, int[] a2) 
    {
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0; i<a1.length; i++)
       {
           list.add(a1[i]);
       }
       int j=0;
       for(int i=0; i<a2.length; i++)
       {
           if(list.contains(Integer.valueOf(a2[i])))
           {
              a1[j++]=a2[i];
              list.remove(Integer.valueOf(a2[i]));i--;
           }
       }
       Collections.sort(list);
       for(int i=0; i<list.size();i++)
       {
           a1[j++]=list.get(i);
       }
    }
}
