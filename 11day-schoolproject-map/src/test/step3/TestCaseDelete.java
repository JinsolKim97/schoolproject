package test.step3;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseDelete {

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

		service.deletePersonByTel("0101231239");
		System.out.println("**삭제 후 명단**");
		service.printAll();// 5명 출력

	}

}