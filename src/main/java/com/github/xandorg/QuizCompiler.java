package com.github.xandorg;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QuizCompiler {
    private static final String fullQuizName = "APIQuiz";
    private static final String coursePath = "D:\\School\\CampusMölndal\\lectures\\5_api\\";

    public static void main(String[] args) throws IOException {
        QuizCompiler quizCompiler = new QuizCompiler();
        quizCompiler.createFullQuiz(coursePath);
    }

    private void createFullQuiz(String coursePath) throws IOException {
//        File fullQuiz = new File("src/main/resources/fullQuiz");
        List<File> quizzes = new ArrayList<>();
        Util.listAllQuiz(coursePath, quizzes);

        List<Question> questions = new ArrayList<>();
        for (File quiz : quizzes) {
            questions.addAll(QuizReader.getQuestions(quiz));
            System.out.println(quiz.getName());
        }

        StringBuilder fullQuiz = new StringBuilder();
        for (Question question : questions) {
            fullQuiz.append(question.toString());
        }
        Files.writeString(Path.of("src/main/resources/" + fullQuizName), fullQuiz.toString());
    }
}
