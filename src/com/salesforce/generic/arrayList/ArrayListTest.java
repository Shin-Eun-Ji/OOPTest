package com.salesforce.generic.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        // for-each loop
        for (String color : colors) {
            System.out.print(color + "  ");
        }
        System.out.println();

        // for loop
        for (int i = 0; i < colors.size(); ++i) {
            System.out.print(colors.get(i) + "  ");
        }
        System.out.println();

        // using iterator
        Iterator<String> iterator = colors.iterator(); // 0번쨰를 가리키고 있다가 hasNext()를 만나면 다음을 가리킴.
        while (iterator.hasNext()) { // 다음이 없으면 false를 리턴
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();

        // using listIterator
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + "  ");
        }
        System.out.println();
	}

}
