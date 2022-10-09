package matt_problems;

public class MockInterview {
    public static void main(String[] args) {

        String str = "Tyson is the best";

        String[] str1 = str.split(" ");

        String result = "";
        for (int i = str1.length - 1; i >= 0; i--) {
            result += str1[i] + " ";
        }
        result = result.trim();
        System.out.println(result.trim());


    }

}
