package com.micles92.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lesiulol on 16.05.16.
 */
@Entity
@Table(name = "RESULT")
public class Result {

    public enum Status{
        TAKE, PASSED, FAILED;
    }
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "SCORE")
    private BigDecimal score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXAM_ID")
    private Exam exam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
}
