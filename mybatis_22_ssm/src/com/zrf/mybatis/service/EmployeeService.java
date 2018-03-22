package com.zrf.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zrf.mybatis.bean.Employee;
import com.zrf.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {
  
  @Autowired	
  private EmployeeMapper employeeMapper;
  
  public List<Employee>getEmps(){
	  return employeeMapper.getEmps();
  }
}
