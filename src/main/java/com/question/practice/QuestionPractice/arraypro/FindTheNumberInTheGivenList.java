package com.question.practice.QuestionPractice.arraypro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheNumberInTheGivenList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(101);
        numbers.add(90);
        numbers.add(15);
        numbers.add(151);
        numbers.add(100);
        numbers.add(112);
        numbers.add(96);
        numbers.add(80);
        numbers.add(105);

//        long count = numbers.stream().filter(n -> n > 100).count();


//        List<Integer> collect = numbers.parallelStream().filter(n -> n > 100).collect(Collectors.toList());
        long count = numbers.parallelStream().filter(n -> n > 100).count();
        System.out.println(count);
//        System.out.println(collect);
    }

}
