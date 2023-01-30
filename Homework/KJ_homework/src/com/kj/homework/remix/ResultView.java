package com.kj.homework.remix;

import java.util.List;

import com.kj.homework.model.EmployeeDTO;

public class ResultView {
	
	public void printEmployeeList(List<EmployeeDTO> empList) {
		for(EmployeeDTO emp : empList) {
			System.out.println(emp);
		}
	}

	public void printEmployee(EmployeeDTO emp) {
		System.out.println(emp);
	}
	
	public void printError(String errorCode) {
		String errorMessage = "";
		switch(errorCode) {
		case "selectAll" : errorMessage = "사원 목록 조회 실패"; break;
		case "selectOne" : errorMessage = "사원 조회 실패"; break;
		case "insertEmp" : errorMessage = "사원 등록 실패"; break;
		case "updateEmp" : errorMessage = "사원 정보 수정 실패"; break;
		case "deleteEmp" : errorMessage = "사원 정보 삭제 실패"; break;
				
		}
		System.out.println(errorMessage);
		
	}
	
	public void printsuccessMessage(String successCode) {
		String successMessage = "";
		switch(successCode) {
		case "insert" : successMessage = "사원 등록 성공"; break;
		case "update" : successMessage = "사원 정보 수정 성공"; break;
		case "delete" : successMessage = "사원 정보 삭제 성공"; break;
		}
		
		System.out.println(successMessage);
	}
	
}
