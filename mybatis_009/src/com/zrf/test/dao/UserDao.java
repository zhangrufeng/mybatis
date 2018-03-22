package com.zrf.test.dao;

import java.util.List;

import com.zrf.test.bean.User;

public interface UserDao {
   public User findUserById(Integer id);
   public List<User>findUserByUsername(String username);
   public void insertUser(User user);
   public void updateUser(User user);
   public void deleteUser(Integer id);
}
