package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zrf.mybatis.bean.User;
import com.zrf.mybatis.mapper.UserMapper;

public class Test {

	public static void main(String[] args) throws Exception {
		String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		 SqlSession sqlSession =sqlSessionFactory.openSession();
		 UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		 userMapper.deleteUser(31);
		 sqlSession.commit();
		 sqlSession.close();
	}

	public static void updateUser() {
		String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			 SqlSession sqlSession =sqlSessionFactory.openSession();
			 UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			 User user=new User();
			 user.setUsername("孙志平2");
			 user.setBirthday(new Date());
			 user.setSex("2");
			 user.setAddress("山西太原2");
			 user.setId(31);
			 userMapper.updateUser(user);
			 sqlSession.commit();
			 sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertUser() {
		String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			 SqlSession sqlSession =sqlSessionFactory.openSession();
			 UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			 User user=new User();
			 user.setUsername("孙志平");
			 user.setBirthday(new Date());
			 user.setSex("1");
			 user.setAddress("山西太原");
			 userMapper.insertUser(user);
			 sqlSession.commit();
			 sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findUserByUsername() {
		String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
		try {
			 InputStream inputStream= Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			 SqlSession sqlSession =sqlSessionFactory.openSession();
			 UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			 List<User>userList=userMapper.findUserByUsername("小明");
			 System.out.println(userList);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findUserById() {
		String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
		   try {
			   InputStream  inputStream =Resources.getResourceAsStream(resource);
			   SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			   SqlSession sqlSession =sqlSessionFactory.openSession();
			   UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			   User user=userMapper.findUserById(1);
			   System.out.println(user);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
