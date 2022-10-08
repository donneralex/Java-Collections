package com.donner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class LegatBeispiel {
    public static void main(String[] args) {
        System.out.println("\nVector:\n==========");
        // Vector
        Vector<Integer> vect = new Vector<Integer>();
        vect.add(1);
        vect.add(2);
        vect.add(3);
        vect.add(4);
        vect.add(5);
        vect.add(6);

        Enumeration<Integer> en = vect.elements();

        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }

        // Hashtable
        System.out.println("\nHashtable:\n==========");

        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
        ht.put("One Hundred",new Integer(100));
        ht.put("Two Hundred",new Integer(200));
        ht.put("Three Hundred",new Integer(300));
        ht.put("Four Hundred",new Integer(400));

        Set st = ht.entrySet();
        Iterator itr=st.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            System.out.println(m.getKey()+": "+m.getValue());
        }

        // Properties
        System.out.println("\nProperties:\n==========");

        Properties pr = new Properties();
        pr.put("Fabian", "Hohn");
        pr.put("Leo", "Müller");
        pr.put("Julian", "Berkemeier");
        pr.put("Franz", "Aguero");
        Set< ?> names = pr.keySet();

        for(Object ob: names)
        {
            System.out.println(ob+", "+ pr.getProperty((String)ob) );
        }

        // Stack
        System.out.println("\nStack:\n==========");

        Stack sta = new Stack();
        sta.push(1);
        sta.push(2);
        sta.push(3);
        sta.push(4);
        sta.push(5);
        Enumeration enu = sta.elements();

        while(enu.hasMoreElements())
            System.out.print(enu.nextElement()+" ");

        sta.pop();
        sta.pop();

        System.out.println("\nNach 2 mal popen.");

        Enumeration e2 = sta.elements();

        while(e2.hasMoreElements())
            System.out.print(e2.nextElement()+" ");
        System.out.println();

        System.out.println("\nDictionary:\n==========");

        // Dictionary
        Dictionary person = new Hashtable();

        person.put("101", "Fabian");
        person.put("102", "Leo");
        person.put("103", "Julian");
        person.put("104", "Franz");
        person.put("105", "Icke");


        for (Enumeration enum1 = person.elements(); enum1.hasMoreElements();)
        {
            System.out.println(enum1.nextElement());
        }

        System.out.println("\nName der person 101 : " + person.get("101"));

        for (Enumeration enum2 = person.keys(); enum2.hasMoreElements();)
        {
            System.out.println("Ids der Personen: " + enum2.nextElement());
        }
        System.out.println("\nLöschen: " + person.remove("103"));

        System.out.println("\nGröße des Personen dictionaries : " + person.size());

    }
}