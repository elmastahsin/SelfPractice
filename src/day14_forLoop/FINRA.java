package day14_forLoop;

public class FINRA {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print(" RA ");

            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(" FINRA ");

            }else {
                System.out.print(i+ " ");
            }
        }
    }
}
