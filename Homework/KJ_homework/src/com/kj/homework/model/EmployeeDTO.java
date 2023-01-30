package com.kj.homework.model;

public class EmployeeDTO {

	private int empNo;
	private String empName;
	private String phone;
	private String email;
	private String entYN;
	
	public EmployeeDTO() {}

	public EmployeeDTO(int empNo, String empName, String phone, String email, String entYN) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.email = email;
		this.entYN = entYN;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEntYN() {
		return entYN;
	}

	public void setEntYN(String entYN) {
		this.entYN = entYN;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", empName=" + empName + ", phone=" + phone + ", email=" + email
				+ ", entYN=" + entYN + "]";
	}
	
	public EmployeeDTO(String name , String phone, String email) {
		this.email = email;
		this.empName = name;
		this.phone = phone;
	}
	
	
	
}
