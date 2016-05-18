package com.micles92.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lesiulol on 16.05.16.
 */
@Entity
@Table(name = "USER")
public class User extends BaseEntity {
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Result>results;
}
