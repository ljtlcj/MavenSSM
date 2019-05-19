package com.dls.dao;

import com.dls.domain.User;

public interface UserMapper {

    public User getUserByname(String name);

    public int addUser(String username, String password);
}

