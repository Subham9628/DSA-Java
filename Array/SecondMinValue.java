
public class SecondMinValue {
    public static int secondMinValue(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        int second=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<second && a[i]>min ) {
                second = a[i];
            }
        }
       return (second==Integer.MAX_VALUE)?-1:second;
    }
}
