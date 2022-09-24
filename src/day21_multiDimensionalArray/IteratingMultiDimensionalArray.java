package day21_multiDimensionalArray;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};
        for (String[][][][][][][][][] i : array) {
            for (String[][][][][][][][] i2 : i) {
                for (String[][][][][][][] i3 : i2) {
                    for (String[][][][][][] i4 : i3) {
                        for (String[][][][][] i5 : i4) {
                            for (String[][][][] i6 : i5) {
                                for (String[][][] i7 : i6) {
                                    for (String[][] i8 : i7) {
                                        for (String[] i9 : i8) {
                                            for (String i10 : i9) {
                                                System.out.println(i10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can dispay each elements of the given array
*/