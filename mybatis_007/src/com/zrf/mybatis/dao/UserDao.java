package com.zrf.mybatis.dao;

import java.util.List;

import com.zrf.mybatis.bean.User;

public interface UserDao {
   public User findUserById(int id);
   public List<User>findUserByUsername(String username);
   public void insertUser(User user);
   public void updateUser(User user);
   public void deleteUser(int id);
}
