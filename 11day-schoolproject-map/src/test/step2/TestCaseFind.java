package test.step2;

import model.Employee;

import model.Person;

import model.SchoolService;

import model.Student;

import model.Teacher;

public class TestCaseFind {

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
		
		String tel = "0101231235";
		//tel = "0101231230";//존재하지 않는 번호로도 테스트 
		Person p = service.findPersonByTel(tel);
		System.out.println("검색결과:" + p); // tel에 해당하는 구성원이 있으면 출력하고 없으면 null이 출력됨
		System.out.println("***검색완료***");

	}
}






