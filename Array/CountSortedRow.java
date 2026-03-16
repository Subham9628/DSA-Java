
// User function Template for Java
public class CountSortedRow {
    public static int sortedCount(int N, int M, int Mat[][]) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int a = 0, d = 0;
            for (int j = 0; j < M - 1; j++) {
                if (Mat[i][j] < Mat[i][j + 1]) {
                    a++;
                }
                if (Mat[i][j] > Mat[i][j + 1]) {
                    d++;
                }

            }
            if (a == M - 1 || d == M - 1)
                count++;

        }
        return count;
    }
}
