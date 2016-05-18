package com.micles92.model;

import javax.persistence.*;

/**
 * Created by lesiulol on 16.05.16.
 */
@Entity
@Table(name = "ANSWER")
public class Answer extends BaseEntity {

    @Column(name = "CORRECT")
    private boolean correct;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

}
