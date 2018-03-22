package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zrf.mybatis.bean.User;
/**
 * 根据id查询用户
 *
 */
public class Test {
  public static void main(String[] args) {
	String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
	try {
		InputStream  input=Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(input);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		User user=sqlSession.selectOne("user.findUserById", 24);
		System.out.println(user);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
