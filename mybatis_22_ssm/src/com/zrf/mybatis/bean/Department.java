package com.zrf.mybatis.bean;

import java.util.List;

public class Department {
	private Integer id;
	private String departmentName;
	private List<Employee>emps;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	/**
	 * 
	 */
	public Department() {
	}

	/**
	 * @param id
	 * @param departmentName
	 */
	public Department(Integer id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName
				+ "]";
	}
}
