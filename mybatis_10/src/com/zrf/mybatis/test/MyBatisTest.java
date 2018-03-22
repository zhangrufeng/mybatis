package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

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
	public void test() throws IOException {

		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
			Employee employee = mapper.getEmpById(1);
			System.out.println(employee);
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void test1()throws IOException{
		SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
		SqlSession sqlSession=sqlSessionFactory.openSession();
		try{
			EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
			
			Employee employee=new Employee(null,"jerry","jerry@163.com","1");
			mapper.addEmp(employee);
			System.out.println(employee.getId());
		/*	Employee employee=new Employee(1,"jerry","jerry@163.com","0");
			mapper.updateEmp(employee);*/
//			mapper.deleteEmpById(2);
			
			sqlSession.commit();
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void test2()throws IOException{
		SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
		SqlSession sqlSession=sqlSessionFactory.openSession();
		try{
			EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
			Employee employee=mapper.getEmpByIdAndLastName(1, "tom");
			System.out.println(employee);
		}finally{
			sqlSession.close();
		}
	}

}
