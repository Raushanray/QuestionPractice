package com.question.practice.QuestionPractice.array_sort_in_rev;

import java.util.Arrays;

public class UsingLambdaExp {
    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5};

        Arrays.sort(array, (a,b) -> b-a);
        System.out.println(Arrays.toString(array));
    }
}
