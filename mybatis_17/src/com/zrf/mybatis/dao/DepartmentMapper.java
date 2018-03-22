package com.zrf.mybatis.dao;

import com.zrf.mybatis.bean.Department;

public interface DepartmentMapper {
	public Department getDeptById(Integer id);

	public Department getDeptByIdPlus(Integer id);
}
