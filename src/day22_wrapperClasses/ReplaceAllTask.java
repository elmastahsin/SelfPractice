package day22_wrapperClasses;

public class ReplaceAllTask {
    public static void main(String[] args) {

    }
    public static int [] replaceAllTask (int[] array , int oldElement,int newElement ) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldElement){
                array[i]= newElement;
            }
        }
       return array ;
    }
    public static double [] replaceAllTask (double[] array , double oldElement,double newElement ) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldElement){
                array[i]= newElement;
            }
        }
        return array ;
    }
    public static char [] replaceAllTask (char[] array , char oldElement,char newElement ) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldElement){
                array[i]= newElement;
            }
        }
        return array ;
    }
    public static String [] replaceAllTask (String[] array , String oldElement,String newElement ) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldElement){
                array[i]= newElement;
            }
        }
        return array ;
    }
}
/*
2. RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters:
         integer array, integer oldElement, integer newElement.
         The method replaces all the element of the array that matching with the given
         old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
*/