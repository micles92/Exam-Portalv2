package com.micles92.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lesiulol on 16.05.16.
 */
@Entity
@Table(name = "RESULT")
public class Result extends BaseEntity {

    public Result() {
        this.status = Status.IN_PROGRESS;
    }


    public enum Status{
        IN_PROGRESS, PASSED, FAILED;
    }
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "SCORE")
    private BigDecimal score;

    @Column(name = "SEQUENCE")
    private String sequence;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXAM_ID")
    private Exam exam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
