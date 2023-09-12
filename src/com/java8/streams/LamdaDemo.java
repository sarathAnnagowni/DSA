package com.java8.streams;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LamdaDemo {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> add=(a,b)->System.out.println(a+b);
        add.accept(10,5);

        Comparator<String> comparator = (s1,s2)->s1.compareTo(s2);

        System.out.println(comparator.compare("sar", "sat"));


    }
}
