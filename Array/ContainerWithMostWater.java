public class ContainerWithMostWater {

    public int maxWater(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int result = 0;
        while (left < right) {
            int num = (right - left) * Math.min(arr[left], arr[right]);
            result = Math.max(result, num);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}