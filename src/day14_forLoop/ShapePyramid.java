package day14_forLoop;

public class ShapePyramid {
    public static void main(String[] args) {
        System.out.println("\n\nPattern A");
        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(  " * ");
            }
            System.out.println();
        }

        System.out.println("\n\nPattern B");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n\nPattern C");
        for (int i = 1; i <= 8; i++) {
            for (int k = 1; k <= 8 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(  " * ");
            }
            System.out.println();
        }

        System.out.println("\n\nPattern D");
        for (int i = 1; i <= 6; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
