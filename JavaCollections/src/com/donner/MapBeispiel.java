package com.donner;

import java.util.*;

public class MapBeispiel {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0,"Fabian");
        map.put(1,"Pascal");

        String name = new String("Leo");
        map.put(2,name);
        map.put(2,"Julian");    // Duplikate Keys werden die Values überschrieben

        Set keys = map.keySet();
        Set entries = map.entrySet();
        Collection col = map.values();

        System.out.println("HashMap: ");
        System.out.println(col);
        System.out.println("Keys: ");
        System.out.println(keys);
        System.out.println("Entries: ");
        System.out.println(entries);
        System.out.println("Values: ");
        System.out.println(col);


    }
}