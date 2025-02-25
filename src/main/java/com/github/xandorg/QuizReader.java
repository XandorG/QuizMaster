package com.github.xandorg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizReader {
    public static List<Question> getQuestions(File quiz) {
        List<Question> questions = new ArrayList<>();
        try (Scanner scanner = new Scanner(quiz)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("#")) {
                    continue;
                }
                if (line.contains("?")) {
                    questions.add(readQuestion(scanner, line));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return questions;
    }

    private static Question readQuestion(Scanner scanner, String question) {
        List<String> answers = new ArrayList<>();
        char correctAnswer = 'ö';
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("A) ")) {
                answers.add(line);
                for (int i = 0; i < 3; i++) {
                    line = scanner.nextLine();
                    answers.add(line);
                }
                continue;
            }
            if (line.contains("Rätt svar:")) {
                correctAnswer = line.toLowerCase().charAt(line.length()-1);
                break;
            }
        }
        return new Question(question, answers, correctAnswer);
    }
}
