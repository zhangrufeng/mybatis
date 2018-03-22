package com.zrf.mybatis.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zrf.mybatis.bean.User;
import com.zrf.mybatis.dao.UserDao;



public class Test {
	public static void main(String[] args) throws Exception {
		String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		 SqlSession sqlSession =sqlSessionFactory.openSession();
		 UserDao userDao=sqlSession.getMapper(UserDao.class);
//		 User user=userDao.findUserById(29);
//		 List<User>userList=userDao.findUserByUsername("小明");
//		 User user=new User();
//		 user.setUsername("孙志平2");
//		 user.setBirthday(new Date());
//		 user.setSex("2");
//		 user.setAddress("山西太原2");
//		 user.setId(32);
//		 userDao.updateUser(user);
		 userDao.deleteUser(32);
		 sqlSession.commit();
		 sqlSession.close();
//		 System.out.println(userList);
	}
}
