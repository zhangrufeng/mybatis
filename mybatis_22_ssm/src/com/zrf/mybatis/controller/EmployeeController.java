package com.zrf.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zrf.mybatis.bean.Employee;
import com.zrf.mybatis.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
    
	@RequestMapping("getemp")
	public String getEmps(Map<String, Object> map) {
		List<Employee> emps = employeeService.getEmps();
		map.put("emps", emps);
		return "list";
	}
}
