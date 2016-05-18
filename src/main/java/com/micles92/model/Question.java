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
}
