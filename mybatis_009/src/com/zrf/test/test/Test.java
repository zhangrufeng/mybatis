package com.zrf.test.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zrf.test.bean.User;
import com.zrf.test.dao.UserDao;

public class Test {

	public static void main(String[] args)throws Exception {
       String resource="com/zrf/test/config/SqlMapConfig.xml";
       InputStream inputStream =Resources.getResourceAsStream(resource);
	   SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	   SqlSession sqlSession=sqlSessionFactory.openSession();
	   UserDao userDao=sqlSession.getMapper(UserDao.class);
	   List<User>userList=userDao.findUserByUsername("小明");
//	   User user=userDao.findUserById(29);
	   sqlSession.close();
	   System.out.println(userList);
	  
	}

}
