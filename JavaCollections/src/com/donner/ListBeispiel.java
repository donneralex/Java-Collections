package com.donner;

import java.util.ArrayList;

public class ListBeispiel {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        String s = new String("Hello1");
        list.add(s);
        list.add("Hello2");
        list.add("Hello3");
        list.add("Hello3");

        System.out.println("ArrayList:");
        System.out.println(list);

        list.add(s);

        // Es kann Duplikate geben
        System.out.println("ArrayList nach hinzugefügtem Duplikat:");
        System.out.println(list);


    }
}