package com.micles92.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lesiulol on 16.05.16.
 */
@Entity
@Table(name = "EXAM")
public class Exam extends BaseEntity {

    @Column(name = "NAME")
    private String name;


    public Exam() {
    }

    public Exam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
