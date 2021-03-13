package test.step4;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseUpdate {

	public static void main(String[] args) {

		SchoolService service = new SchoolService();
		service.addPerson(new Student("0101231234", "이희은", "용인", "17"));
		service.addPerson(new Teacher("0101231235", "신정희", "수지", "국어"));
		service.addPerson(new Student("0101231236", "고보승", "수원", "16"));
		service.addPerson(new Employee("0101231237", "이재훈", "화성", "재무부"));
		service.addPerson(new Student("0101231238", "최인재", "용인", "18"));
		service.addPerson(new Teacher("0101231239", "유예주", "용인", "수학"));
		service.printAll();
		System.out.println("***학교 구성원 등록 완료***");
		
		//구성원 정보 수정 
		service.updatePerson(new Teacher("0101231234","박보검","분당","자바"));
		//존재하지 않는 구성원 tel이 있으면 tel에 해당하는 구성원 정보가 없어서 수정 불가 
		service.updatePerson(new Teacher("0101231230","박보검","분당","자바"));
		System.out.println("***수정완료***");
		
		service.printAll();// 5명 출력
		

	}
}











