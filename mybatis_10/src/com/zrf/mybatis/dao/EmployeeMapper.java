package com.zrf.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.zrf.mybatis.bean.Employee;

public interface EmployeeMapper {
	public Employee getEmpById(Integer id);

	public Long addEmp(Employee employee);

	public boolean updateEmp(Employee employee);

	public boolean deleteEmpById(Integer id);
	
	public Employee getEmpByIdAndLastName(@Param("id")Integer id,@Param("lastName")String lastName);
}
