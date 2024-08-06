package com.question.practice.QuestionPractice.arraypro;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abvds", null, "c");
        //List<String> strings = list.stream().map(String::toUpperCase).collect(Collectors.toList()); //NullPointerException
        List<String> strings = list.stream().filter(Objects::nonNull).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(strings);
    }
}
