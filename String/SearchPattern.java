import java.util.ArrayList;

public class SearchPattern {
    public static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder(txt.substring(0, pat.length()));
        int len = pat.length() - 1;
        int size = txt.length() - 1;
        for (int i = len; i < size; i++) {
            if (sb.toString().equals(pat)) {
                list.add(i + 1 - pat.length());
                sb.delete(0, 1);
                sb.append(txt.charAt(i + 1));
            } else {
                sb.delete(0, 1);
                sb.append(txt.charAt(i + 1));
            }
        }
        if (sb.toString().equals(pat)) {
            list.add(size - pat.length() + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(search("ab", "abfdabnfiab"));
    }
}
