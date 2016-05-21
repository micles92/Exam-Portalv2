package com.micles92.service.impl;

import com.micles92.dao.UserDao;
import com.micles92.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;

import java.util.List;

/**
 * Created by lesiulol on 21.05.16.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public List<com.micles92.model.User> findAll() {
        return userDao.findAll();
    }


    public void save(com.micles92.model.User user) {
        userDao.save(user);
    }

    public com.micles92.model.User findOne(Long id) {
        return userDao.findOne(id);
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public com.micles92.model.User findByLogin(String login) {
        return userDao.findByLogin(login);
    }
}