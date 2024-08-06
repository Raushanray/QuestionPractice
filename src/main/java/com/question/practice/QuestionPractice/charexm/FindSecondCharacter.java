package com.question.practice.QuestionPractice.charexm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondCharacter {
    public static void main(String[] args) {
        List<Character> input = Arrays.asList('s', 't', 'r', 's', 's');
        char result = findSecondCharacters(input);
        if (result == '\0') {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    private static char findSecondCharacters(List<Character> input) {
        return input.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0');

    }
}
