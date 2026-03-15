public class RotateArray {
    public static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, n - d - 1);
        reverseArray(arr, n - d, n - 1);
    }

    private static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

}