package com.question.practice.QuestionPractice.array_sort_in_rev;

import java.util.Arrays;
import java.util.Comparator;

public class UsingArraySort {
    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5};

        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
