import java.util.Arrays;
import java.util.Formattable;

public class PartsofList {
    public static void main(String[] args) {

        String[] a = {"az", "toto", "picaro", "zone", "kiwi"};

        System.out.println(Arrays.deepToString(partlist(a)));

    }

    public static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][2];

        for (int i = 0; i < arr.length -1; i++) {
            String a = "";
            String b = "";
            for (int j = 0; j < i + 1; j++) {
                a +=  arr[j] + " ";
            }
            a = a.trim();

            result[i][0] = a;

            for (int s = i + 1; s < arr.length ; s++) {
                b += arr[s] + " ";
            }
            b = b.trim();
            result [i][1] =b;

        }

        // your code
        return result;
    }
}
