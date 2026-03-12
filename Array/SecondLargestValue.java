
import java.util.Arrays;

public class SecondLargestValue {

   public static int secondMaxValueWorst(int []arr) {
      if (arr == null || arr.length<=1)
         return -1;
      int a[] = arr.clone();
      Arrays.sort(a);
      for (int i = a.length - 2; i >= 0; i--) {
         if (a[i] != a[a.length - 1]) {
            return a[i];
         }
      }
      return -1;
   }

   public static int secondMaxValueAverage(int a[]) {
      if (a == null ||a.length<= 1)
         return -1;
      int max = a[0], secondMax = Integer.MIN_VALUE;
      for (int i = 0; i < a.length; i++) {
         if (a[i] > max) {
            max = a[i];
         }
      }
      for (int i = 0; i < a.length; i++) {
         if (a[i] > secondMax && a[i] != max)
            secondMax = a[i];
      }
      return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
   }

   public static int secondMaxValueBest(int a[]) {

      if (a == null || a.length<= 1)
         return -1;
      int max = a[0], secondMax = Integer.MIN_VALUE;
      for (int i = 1; i < a.length; i++) {
         if (a[i] > max) {
            secondMax = max;
            max = a[i];
         } else if (a[i] > secondMax && a[i]!=max)
            secondMax = a[i];
      }
      return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
   }

}