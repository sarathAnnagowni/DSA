package com.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
        String[] arrayOfWords={"Sarath","Babu"};
        Stream<String> streamOfWords= Arrays.stream(arrayOfWords);
        streamOfWords.map(word->word.split("")).flatMap(Arrays::stream).forEach(System.out::println);
       // streamOfWords.map(word->word.split("")).forEach(System.out::println);
    }
}
