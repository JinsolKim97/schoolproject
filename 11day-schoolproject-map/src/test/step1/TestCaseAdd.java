package test.step1;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseAdd {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addPerson(new Student("0101231234", "이희은", "용인", "17"));
		service.addPerson(new Teacher("0101231235", "신정희", "수지", "국어"));
		service.addPerson(new Student("0101231236", "고보승", "수원", "16"));
		service.addPerson(new Employee("0101231237", "이재훈", "화성", "재무부"));
		service.addPerson(new Student("0101231238", "최인재", "용인", "18"));
		service.addPerson(new Teacher("0101231239", "유예주", "용인", "수학"));
		service.printAll();
		
//0101231234 tel 이 중복되어 추가될 수 없습니다
		service.addPerson(new Student("0101231234", "아이유", "잠실", "18"));
		System.out.println("***학교 구성원 등록 완료***");
		service.printAll();// 6명 출력

	}
}


















