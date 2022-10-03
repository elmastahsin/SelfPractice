package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveAllMatching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        System.out.println(list);
        System.out.println("enter name which you want to remove : ");
        String name = input.next();
        list.removeAll(Arrays.asList(name));

        System.out.println(list);




    }
}
/*
3. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];*/