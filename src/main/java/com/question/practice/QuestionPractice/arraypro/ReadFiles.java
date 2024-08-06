package com.question.practice.QuestionPractice.arraypro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFiles {
    public static void main(String[] args) {

        try (Stream<String> lines = Files.lines(Paths.get("D:\\Raushan\\file.txt"))){
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
