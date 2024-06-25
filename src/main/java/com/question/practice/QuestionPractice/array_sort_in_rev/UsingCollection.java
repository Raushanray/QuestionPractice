package com.question.practice.QuestionPractice.array_sort_in_rev;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollection {
    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5,6};
        List<Integer> arrayList = Arrays.asList(array);
        Collections.sort(arrayList, Collections.reverseOrder());
        array = arrayList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
}
