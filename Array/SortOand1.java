public class SortOand1 {

    public static void sortTwoPointer(int a[]) {
    int left = 0, right = a.length - 1;
    while (left < right) {
        while (a[left] == 0 && left < right) left++;
        while (a[right] == 1 && left < right) right--;
        if (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
}
