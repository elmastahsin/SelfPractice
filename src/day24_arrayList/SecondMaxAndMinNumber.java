package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMinNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        int n = 2;
        //      list.removeIf(p->Collections.max(list)==p);
        //    list.removeIf(p-> Collections.min(list)==p);
        list.removeIf(p -> Collections.max(list) == p || Collections.min(list) == p);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops*/