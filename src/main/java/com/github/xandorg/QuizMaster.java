package com.github.xandorg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuizMaster {
    List<Question> questionList;


    public static void main(String[] args) {
        String fullQuizPath = "src/main/resources/Test_quiz_Updated_250114-COMPLETE.md";

        QuizMaster quizMaster = new QuizMaster(new File(fullQuizPath));
        quizMaster.runQuiz();
    }


    public QuizMaster(File quiz) {
        questionList = getQuestions(quiz);
    }

    public void runQuiz() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Question question = questionList.get(random.nextInt(questionList.size()));
            question.printQuestion();

            String answer = scanner.nextLine();
            if (answer.equals("q")) {
                break;
            }
            if (question.checkAnswer(answer.toLowerCase().charAt(0))) {
                System.out.println("Correct!!");
            } else {
                System.out.println("Wrong answer!\n Correct answer: " + question.correctAnswer);
            }
        }
        scanner.close();
    }

    private List<Question> getQuestions(File quiz) {
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

    private Question readQuestion(Scanner scanner, String question) {
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

    private static class Question {
        String question;
        List<String> answers;
        char correctAnswer;

        public Question(String question, List<String> answers, char correctAnswer) {
            this.question = question;
            this.answers = answers;
            this.correctAnswer = correctAnswer;
        }

        public void printQuestion() {
            System.out.println(question);
            System.out.println();
            for (int i = 0; i < answers.size(); i++) {
                System.out.println(answers.get(i));
            }
        }

        public boolean checkAnswer(char answer) {
            return answer == correctAnswer;
        }
    }
}
