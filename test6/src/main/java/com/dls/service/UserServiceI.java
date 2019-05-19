package com.dls.service;

import com.dls.domain.User;

public interface UserServiceI {

    public User getUserByname(String name);
    
    public int addUser(String username, String password);
}
