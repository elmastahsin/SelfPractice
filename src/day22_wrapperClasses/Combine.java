package day22_wrapperClasses;

import java.util.Arrays;

public class Combine {
    public static void main(String[] args) {
        char [] array1 = {'A','B','C','D'};
        char [] array2 = {'E','F','G','H'};
        System.out.println(Arrays.toString(combine(array1,array2)));
    }
    public static char [] combine ( char [] array1,char [] array2){
        char [] result = new char[array1.length+array2.length];
        int i =0;
        for (; i < array1.length; i++) {
            result [i]= array1[i];

        }
        for (int j = 0; j < array2.length; j++, i++) {
            result [i] = array2[j];
        }

        return result ;

    }
}
