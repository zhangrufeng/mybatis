package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zrf.mybatis.bean.User;

public class Test {

	public static void main(String[] args) {
		 String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
         try {
        	 InputStream inputStream=Resources.getResourceAsStream(resource);
        	 SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        	 SqlSession sqlSession=sqlSessionFactory.openSession();
        	 User user=new User();
        	 user.setId(29);
        	 user.setUsername("王大军");
        	 user.setBirthday(new Date());
        	 user.setSex("2");
        	 user.setAddress("甘肃平凉");
        	 sqlSession.update("user.updateUser", user);
        	 sqlSession.commit();
        	 sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
