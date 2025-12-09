package com.java8.feature.foreachDemo;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Saif");
        list.add("samir");
        list.add("waseem");
        list.add("azhar");
        list.add("faiz");
        list.add("farhan");

        /*for(String name : list)
            System.out.println(name);*/

        list.stream().filter(s -> s.startsWith("f")).forEach(name-> System.out.println("With Stream APi :"+name) );



        Map<Integer,String> map = new HashMap<>();
        map.put(1,"saif");
        map.put(2,"sam");
        map.put(3,"monu");
        map.put(4,"waseem");

        map.forEach((key,value)-> System.out.println(key+":"+value));

        map.entrySet().stream().forEach(obj -> System.out.println(obj));
    }
}
