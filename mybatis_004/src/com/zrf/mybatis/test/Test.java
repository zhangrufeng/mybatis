package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * 删除用户
 *
 */
public class Test {

	public static void main(String[] args) {
       String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
       try {
    	   InputStream  inputStream =Resources.getResourceAsStream(resource);
    	   SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    	   SqlSession sqlSession =sqlSessionFactory.openSession();
    	   sqlSession.delete("user.deleteUser", 28);
    	   sqlSession.commit();
    	   sqlSession.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
