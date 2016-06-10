package com.micles92.service.impl;

import com.micles92.dao.UserDao;
import com.micles92.model.User;
import com.micles92.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lesiulol on 21.05.16.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public void save(User user){
        userDao.save(user);
    }

    public  User getLoggedUser(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();

        return userDao.findByEmail(email);
    }


}
