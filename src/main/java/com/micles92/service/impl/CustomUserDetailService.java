package com.micles92.service.impl;

import com.micles92.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 26.05.16.
 */
public class CustomUserDetailService implements UserDetailsService {

    private UserService userService;


    public CustomUserDetailService(UserService userService) {
        this.userService = userService;
    }


    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       com.micles92.model.User user = userService.findByEmail(email);
        List<GrantedAuthority>authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),authorities );
    }
}
