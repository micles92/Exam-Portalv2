package com.micles92.model;

import javax.persistence.*;

/**
 * Created by lesiulol on 16.05.16.
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }


}
