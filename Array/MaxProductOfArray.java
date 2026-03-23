public class MaxProductOfArray {

    int maxProduct(int[] arr) {
        int maxEnding = arr[0];
        int minEnding = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int maxTemp = curr * maxEnding;
            int minTemp = curr * minEnding;
            maxEnding = Math.max(curr, Math.max(maxTemp, minTemp));
            minEnding = Math.min(curr, Math.min(maxTemp, minTemp));
            result = Math.max(result, maxEnding);

        }
        return result;
    }
}
