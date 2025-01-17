package com.github.xandorg;

import java.util.List;

public class Question {
    String question;
    List<String> answers;
    char correctAnswer;
    int nbrOfCorrectAnswers;

    public Question(String question, List<String> answers, char correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        nbrOfCorrectAnswers = 0;
    }

    public void printQuestion() {
        System.out.println(question);
        System.out.println();
        for (String answer : answers) {
            System.out.println(answer);
        }
    }

    public boolean checkAnswer(char answer) {
        boolean isCorrect = answer == correctAnswer;
        if (isCorrect) {
            nbrOfCorrectAnswers++;
        } else {
            nbrOfCorrectAnswers--;
        }
        return isCorrect;
    }

}
