package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zrf.mybatis.bean.User;
/**
 * 根据名称模糊查询用户
 *
 */
public class Test {

	public static void main(String[] args) {
        String resource="com/zrf/mybatis/config/SqlMapConfig.xml";
        try {
        	InputStream inputStream=Resources.getResourceAsStream(resource);
        	SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        	SqlSession  sqlSession =sqlSessionFactory.openSession();
        	List<User>userList=sqlSession.selectList("user.findUserByName", "小明");
        	System.out.println(userList);
        	sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
