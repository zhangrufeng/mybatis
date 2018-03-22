package com.zrf.mybatis.dao;



import java.util.List;

import com.zrf.mybatis.bean.Employee;

public interface EmployeeMapper {
	public List<Employee>getEmpsByConditionIf(Employee employee);
    public List<Employee>getEmpsByConditionTrim(Employee employee);
}
