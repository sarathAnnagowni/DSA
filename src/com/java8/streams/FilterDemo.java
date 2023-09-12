package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class FilterDemo {

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

        //departmentList.stream().filter(word->word.startsWith("S")).forEach(System.out::println);

        List<String> filteredList=departmentList.stream().filter(word->word.startsWith("S")).distinct().collect(Collectors.toList());
        filteredList.stream().forEach(System.out::println);


    }
}
