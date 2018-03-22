package com.zrf.mybatis.dao;

import com.zrf.mybatis.bean.Employee;

public interface EmployeeMapper {
  public Employee getEmpById(Integer id);
}
