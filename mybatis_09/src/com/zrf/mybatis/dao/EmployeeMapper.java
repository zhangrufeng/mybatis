package com.zrf.mybatis.dao;

import com.zrf.mybatis.bean.Employee;

public interface EmployeeMapper {
	public Employee getEmpById(Integer id);

	public Long addEmp(Employee employee);

	public boolean updateEmp(Employee employee);

	public boolean deleteEmpById(Integer id);
}
