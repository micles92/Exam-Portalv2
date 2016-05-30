package com.micles92.dao;

import com.micles92.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lesiulol on 21.05.16.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
