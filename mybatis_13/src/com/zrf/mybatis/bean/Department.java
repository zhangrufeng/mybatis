package com.zrf.mybatis.bean;

public class Department {
	private Integer id;
	private String departmentName;

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
