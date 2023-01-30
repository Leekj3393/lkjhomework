package com.kj.homework.remix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.kj.homework.model.EmployeeDTO;

public class View {

	private Controller controller = new Controller();

	public void displayEmployee() {

		Scanner sc = new Scanner(System.in);

		//List<EmployeeDTO> employeeList = new ArrayList<>();

		do {
			System.out.println("======== 사원 관리 ========");
			System.out.println("1. 사원 전체 조회");
			System.out.println("2. 사번으로 사원 조회");
			System.out.println("3. 신규 사원 추가");
			System.out.println("4. 사원 정보 수정");
			System.out.println("5. 사원 정보 삭제");
			System.out.print("메뉴 관리 번호를 입력 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1: controller.selectAll(); break;
			case 2: controller.selectOne(inputEmpNo()); break;
			case 3: controller.insertEmp(inputEmp()); break;
			case 4: controller.updateEmp(updateEmp()); break;
			case 5: controller.deleteEmp(inputEmpNo()); break; 

			default:
				System.out.println("잘못 된 메뉴를 선택하셨습니다.");
			}
		} while (true);

	}

	private static Map<String, String> inputEmp() {

		Scanner sc = new Scanner(System.in);
		System.out.println("사원 이름: : ");
		String name = sc.nextLine();
		System.out.println("핸드폰 번호 : ");
		String phone = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
		System.out.println("퇴사 여부 (Y/N) : ");
		String entYn = sc.nextLine();

		Map<String, String> parameter = new HashMap<>();
		parameter.put("name", name);
		parameter.put("phone", phone);
		parameter.put("email", email);
		parameter.put("entYn", entYn);

		return parameter;
	}

	private static Map<String, String> inputEmpNo() {

		Scanner sc = new Scanner(System.in);
		System.out.println("사번 입력 : ");
		String empNo = sc.nextLine();

		Map<String, String> parameter = new HashMap<>();
		parameter.put("empNo", empNo);

		return parameter;
	}

	private static Map<String, String> updateEmp() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 사원 사번 : ");
		String empNo = sc.nextLine();
		System.out.print("수정할 사원 이름 : ");
		String empName = sc.nextLine();
		System.out.print("수정할 사원 핸드폰번호 : ");
		String phone = sc.nextLine();
		System.out.print("수정할 사원 이메일 : ");
		String email = sc.nextLine();
		System.out.print("수정할 사원 퇴사여부 : ");
		String entYn = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("empNo", empNo);
		parameter.put("empName", empName);
		parameter.put("phone", phone);
		parameter.put("email", email);
		parameter.put("entYn", entYn);
		
		return parameter;
	
	
	}
}
