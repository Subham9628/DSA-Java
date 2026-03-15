public class RowWithMax1 {
    // find  maximum 1's contains row from two diamentional binary number array and return index of row
    public static int rowWithMax1s(int arr[][]) {

        int max = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return index;

    }
}