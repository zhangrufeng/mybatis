package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zrf.mybatis.bean.Employee;
import com.zrf.mybatis.dao.EmployeeMapper;
public class MyBatisTest {

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void test3() throws IOException {

		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
			Employee employee=new Employee(null,"%e%",null,null);
			List<Employee> emps = mapper.getEmpsByConditionIf(employee);
			for(Employee e:emps){
				System.out.println(e);
			}
		} finally {
			sqlSession.close();
		}
	}
}
