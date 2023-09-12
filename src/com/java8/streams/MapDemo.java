package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {

        List<String> departmentList=new ArrayList<>();
        departmentList.add("HR");
        departmentList.add("Infra");
        departmentList.add("Sales");
        departmentList.add("Development");
        departmentList.add("HR");
        departmentList.add("Infra");
        departmentList.add("Sales");
        departmentList.add("Development");
        Stream<String> depStream=departmentList.stream().map(word->word.toUpperCase()).distinct();

        System.out.println(Stream.iterate(1,n->n+1).limit(20).max((a,b)->a+b).get());

       // depStream.forEach(System.out::println);
       // depStream.forEach(System.out::println);


    }
}
