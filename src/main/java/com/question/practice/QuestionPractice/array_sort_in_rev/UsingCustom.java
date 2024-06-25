package com.question.practice.QuestionPractice.array_sort_in_rev;

import java.util.Arrays;
import java.util.Comparator;

public class UsingCustom {
    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5};
        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        System.out.println(Arrays.toString(array));
    }
}
