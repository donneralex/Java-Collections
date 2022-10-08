package com.donner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class GenericBeispiel {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Alex");
        stringList.add("Leo");
        stringList.add("Julian");

        // Es ist nicht möglich in eine ArrayList<String> einen anderen Typ hinzuzufügen außer strings
        //stringList.add(2);
        //int i = 5;
        //stringList.add(i);

        System.out.println("ArrayList String:");
        System.out.println(stringList);
    }

}