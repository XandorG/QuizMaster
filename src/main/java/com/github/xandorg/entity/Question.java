package com.github.xandorg.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questions")
@Data
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true  )
    private String question;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> answers;

    @Column(nullable = false)
    private char correctAnswer;

    @Column
    private int nbrOfCorrectAnswers;

    public Question(String question, List<Answer> answers, char correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        nbrOfCorrectAnswers = 0;
    }

    public void printQuestion() {
        System.out.println(question);
        System.out.println();
        for (Answer answer : answers) {
            System.out.println(answer.getText());
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

    @Override
    public String toString() {
        StringBuilder questionString = new StringBuilder(question + "\n");
        for (Answer answer : answers) {
            questionString.append(answer.getText()).append("\n");
        }
        questionString.append("Rätt svar: ").append(correctAnswer).append("\n");
        return questionString.toString();
    }
}
