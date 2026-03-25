
public class SortEvenOdd {

    public static void sortEvenOdd(int a[]) {
        if (a == null || a.length <= 1) return;
        int left = 0, right = a.length - 1;
        while (left < right) {
            if (a[left] % 2 == 1 && a[right] % 2 == 0) {
                int tem = a[left];
                a[left] = a[right];
                a[right] = tem;
                right--;
                left++;
                continue;
            }
            if (a[left] % 2 == 0) {
                left++;
            }
            if (a[right] % 2 == 1) {
                right--;
            }

        }
    }
}
