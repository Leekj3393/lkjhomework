package com.kj.homework.remix;

import java.util.List;
import java.util.Map;

import com.kj.homework.model.EmployeeDTO;
import com.kj.homework.model.service.EmpService;

public class Controller {

	private final EmpService empService;
	private final ResultView resultView;

	public Controller() {
		empService = new EmpService();
		resultView = new ResultView();
	}

	public void selectAll() {

		List<EmployeeDTO> empList = empService.selectAll();

		if (empList != null) {
			resultView.printEmployeeList(empList);
		} else {
			resultView.printError("selecetList");
		}
	}

	public void selectOne(Map<String, String> parameter) {

		int empNo = Integer.parseInt(parameter.get("empNo"));

		EmployeeDTO emp = empService.selectOne(empNo);

		if (emp != null) {
			resultView.printEmployee(emp);
		} else {
			resultView.printError("selectOne");
		}

	}

	public void insertEmp(Map<String, String> parameter) {

		EmployeeDTO emp = new EmployeeDTO();
		emp.setEmpName(parameter.get("name"));
		emp.setPhone(parameter.get("phone"));
		emp.setEmail(parameter.get("email"));

		if (empService.insertEmp(emp)) {
			resultView.printsuccessMessage("insert");
			;
		} else {
			resultView.printError("insert");
			;
		}

	}

	public void updateEmp(Map<String, String> parameter) {

		EmployeeDTO emp = new EmployeeDTO();
		emp.setEmpNo(Integer.parseInt(parameter.get("empNo")));
		emp.setEmpName(parameter.get("name"));
		emp.setPhone(parameter.get("phone"));
		emp.setEmail(parameter.get("email"));
		emp.setEntYN(parameter.get("entYn"));

		if (empService.insertEmp(emp)) {
			resultView.printsuccessMessage("update");
			;
		} else {
			resultView.printError("update");
			;
		}

	}

	public void deleteEmp(Map<String, String> parameter) {

		int empNo = Integer.parseInt(parameter.get("empNo"));
		if (empService.deleteEmp(empNo)) {
			resultView.printsuccessMessage("delete");
			;
		} else {
			resultView.printError("delete");
			;
		}

	}

}