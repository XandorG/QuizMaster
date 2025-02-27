package com.github.xandorg;

import com.github.xandorg.config.DatabaseConnection;
import com.github.xandorg.config.H2Connection;
import com.github.xandorg.entity.Question;

import java.io.File;
import java.util.*;

public class QuizMaster {
    private final List<Question> questionList;
    private final Random random = new Random();


    public static void main(String[] args) {
//        String fullQuizPath = "src/main/resources/Test_quiz_Updated_250114-COMPLETE.md";
        String fullQuizPath = "src/main/resources/APIQuiz.txt";

        DatabaseConnection connection = new H2Connection();
        connection.getSessionFactory();

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
                System.out.println("Wrong answer!\n Correct answer: " + question.getCorrectAnswer());
            }
        }
        scanner.close();
    }

    public Question selectQuestion() {
        Question question;

//        int correctPercentage = 10;
//        int unknownPercentage = 15 + correctPercentage;
//        int neutralPercentage = 25 + unknownPercentage;
//        int wrongPercentage = 50 + neutralPercentage;
//
//        int listSelection = random.nextInt(101);
//        if (listSelection < correctPercentage) {
//            //Correctly answered questions
//            System.out.println("Correct");
//        } else if (listSelection < unknownPercentage) {
//            //Unknown questions
//            System.out.println("Unknown");
//        } else if (listSelection < neutralPercentage) {
//            //Neutral Answered questions
//            System.out.println("Neutral");
//        } else if (listSelection <= wrongPercentage){
//            //Wrongly answered questions
//            System.out.println("Wrong");
//        }

        question = questionList.get(random.nextInt(questionList.size()));
        return question;
    }



}
