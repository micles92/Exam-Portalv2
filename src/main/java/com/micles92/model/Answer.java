package com.micles92.model;

import javax.persistence.*;

/**
 * Created by lesiulol on 16.05.16.
 */
@Entity
@Table(name = "ANSWER")
public class Answer extends BaseEntity {

    @Column(name = "CORRECT")
    private Boolean correct;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @Column(name = "TEXT")
    private String text;


    public Boolean isCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
