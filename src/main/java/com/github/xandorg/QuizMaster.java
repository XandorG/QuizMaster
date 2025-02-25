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
        questionList = QuizReader.getQuestions(quiz);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Question question = selectQuestion();
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

    public Question selectQuestion() {
        Random random = new Random();

//        int correctPercentage = 10;
//        int unknownPercentage = 15 + correctPercentage;
//        int neutralPercentage = 25 + unknownPercentage;
//        int wrongPercentage = 50 + neutralPercentage;
//
//        int listSelection = random.nextInt(101);
//        if (listSelection < correctPercentage) {
//            //Correctly answered questions
//        } else if (listSelection < unknownPercentage) {
//            //Unknown questions
//        } else if (listSelection < neutralPercentage) {
//            //Neutral Answered questions
//        } else if (listSelection <= wrongPercentage){
//            //Wrongly answered questions
//        }

        Question question = questionList.get(random.nextInt(questionList.size()));
        return question;
    }



}
