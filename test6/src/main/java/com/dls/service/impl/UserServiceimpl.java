package com.dls.service.impl;
import com.dls.dao.UserMapper;
import com.dls.domain.User;
import com.dls.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceimpl implements UserServiceI {

    @Autowired
    private UserMapper userDao;

    @Transactional
    public User getUserByname(String name) {
        return userDao.getUserByname( name);
    }


    @Transactional
    public int addUser(String username, String password) {
        return userDao.addUser(username,password);

    }
}

