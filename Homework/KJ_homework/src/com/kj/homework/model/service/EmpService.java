package com.kj.homework.model.service;

import static com.kj.homework.model.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kj.homework.model.EmployeeDTO;
import com.kj.homework.model.dao.EmployeeMapper;

public class EmpService {

	private EmployeeMapper employeeMapper;

	/** 전체 조회 */
	public List<EmployeeDTO> selectAll() {
		
		SqlSession sqlSession = getSqlSession();
		
		employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		List<EmployeeDTO> emp = employeeMapper.selectAll();
		
		sqlSession.close();

		return emp;

	}
//	
	public EmployeeDTO selectOne(int empNo) {
		
		SqlSession sqlSession = getSqlSession();
		employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		
		EmployeeDTO emp = employeeMapper.selectOne(empNo);
		
		sqlSession.close();
		
		return emp;
	}
	
	public boolean insertEmp(EmployeeDTO emp) {
		
		SqlSession sqlSession = getSqlSession();
		employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		
		int result = employeeMapper.insertEmp(emp);
		
		if(result >0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result > 0 ? true : false;
	}
	
	
	public boolean updateEmp(EmployeeDTO emp) {
		
		SqlSession sqlSession = getSqlSession();
		employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		
		int result = employeeMapper.updateEmp(emp);
		
		if(result >0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result > 0 ? true : false;
	}
	
	
	public boolean deleteEmp(int emp) {
		
		SqlSession sqlSession = getSqlSession();
		employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		
		int result = employeeMapper.deleteEmp(emp);
		
		if(result >0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result > 0 ? true : false;
		
	}
	
	
}