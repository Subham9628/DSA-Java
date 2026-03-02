import java.util.HashSet;

public class FirstRepeat {

   // Brute Force O(n²)
   public int firstRepeatBrute(int[] a) {
      for (int i = 0; i < a.length; i++) {
         for (int j = 1 + i; j < a.length; j++) {
            if (a[i] == a[j]) {
               return a[i];
            }
         }
      }
      return -1;
   }
   // Optimize solution
   public int firstRepeatHash(int[] a) {
      if (a == null || a.length == 1)
         return -1;
      HashSet<Integer> set = new HashSet<>();
      for (int num : a) {
         if (set.contains(num))
            return num;
         else
         {
            set.add(num);
         }
      }
      return -1;
   }
}
