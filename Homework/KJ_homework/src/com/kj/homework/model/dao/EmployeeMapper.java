package com.kj.homework.model.dao;

import java.util.List;

import com.kj.homework.model.EmployeeDTO;


public interface EmployeeMapper{
	
	List<EmployeeDTO> selectAll();
	
	EmployeeDTO selectOne(int empNo);
	
	int insertEmp(EmployeeDTO emp);
	
	int updateEmp(EmployeeDTO emp);
	
	int deleteEmp(int empNo);

}
