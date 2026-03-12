public class MaxConsecutiveBit {

    // Array must be contains only binary number
    public static int maxConsecutiveBit(int... arr) {
        if (arr == null || arr.length == 0)
            return 0;
        int num = 1;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                num++;
            } else {
                if (max < num)
                    max = num;
                num = 1;
            }
        }
        return max;
    }
}