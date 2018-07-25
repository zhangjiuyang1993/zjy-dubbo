package com.zjy.dubbo.dao;


public interface UserDao {
    public User findUserById(long id);

    public User findUserThrowsException();
}
