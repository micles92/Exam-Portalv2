package com.micles92.service;

import com.micles92.model.User;

/**
 * Created by lesiulol on 21.05.16.
 */
public interface UserService {

    User findByEmail(String email);

    void save(User user);
}
