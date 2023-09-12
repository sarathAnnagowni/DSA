package com.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterviewQuestions {
    public static void main(String[] args) {
        //Find Even Numbers
        List<Integer> list= Arrays.asList(10,13,15,49,8,57,32,43,76,54,14,12,23,15,57,32);
        System.out.println("Even Numbers");
        list.stream().filter(in->in%2==0).forEach(System.out::println);
        System.out.println("Numbers Starting with one");
        list.stream().map(in->in+"").filter(in->in.startsWith("1")).forEach(System.out::println);
        System.out.println("Print Duplicate Numbers");
        Set<Integer> set=new HashSet<>();
        list.stream().filter(in->!set.add(in)).forEach(System.out::println);
        System.out.println("Find Maximum Element ::  " +list.stream().max(Integer::compare).get());


    }
}
