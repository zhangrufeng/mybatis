package com.zrf.mybatis.mapper;

import java.util.List;

import com.zrf.mybatis.bean.User;

public interface UserMapper {
   public User findUserById(int id)throws Exception;
   public List<User>findUserByUsername(String username)throws Exception;
   public void insertUser(User user)throws Exception;
   public void deleteUser(int id)throws Exception;
   public void updateUser(User user)throws Exception;
}
