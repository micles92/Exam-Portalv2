package com.micles92.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lesiulol on 16.05.16.
 */
@Entity
@Table(name = "QUESTION")
public class Question extends BaseEntity {
    @Column(name = "TEXT")
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXAM_ID")
    private Exam exam;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
    private List<Answer>answers;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
