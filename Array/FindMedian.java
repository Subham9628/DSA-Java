// Find median of array 

import java.util.Arrays;

public class FindMedian {
    public static   double findMedian(int[] arr) {
        if (arr == null)
            return -1;
        if (arr.length == 0)
            return 0;
        int n = arr.length;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        if (n % 2 != 0) {
            return (double) arr[n / 2];
        }
        return (double) (arr[n / 2 - 1] + arr[n / 2]) / 2;
    }
}
