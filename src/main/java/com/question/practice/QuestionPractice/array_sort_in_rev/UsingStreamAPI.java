package com.question.practice.QuestionPractice.array_sort_in_rev;

import java.util.Arrays;

public class UsingStreamAPI {

    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5,6};

        Integer[] sortedArray = Arrays.stream(array).sorted((a, b) -> b - a).toArray(Integer[]::new);
        System.out.println(Arrays.toString(sortedArray));
    }
}
