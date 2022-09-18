package day20_forEach;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        String[] words = str.split(" ");

        str = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                str += each + " ";
            }
        }
        str = str.trim();
        System.out.println(Arrays.toString(words));
        System.out.println(str);
    }
}
