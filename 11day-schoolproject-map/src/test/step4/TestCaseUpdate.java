package test.step4;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseUpdate {

	public static void main(String[] args) {

		SchoolService service = new SchoolService();
		service.addPerson(new Student("0101231234", "������", "����", "17"));
		service.addPerson(new Teacher("0101231235", "������", "����", "����"));
		service.addPerson(new Student("0101231236", "����", "����", "16"));
		service.addPerson(new Employee("0101231237", "������", "ȭ��", "�繫��"));
		service.addPerson(new Student("0101231238", "������", "����", "18"));
		service.addPerson(new Teacher("0101231239", "������", "����", "����"));
		service.printAll();
		System.out.println("***�б� ������ ��� �Ϸ�***");
		
		//������ ���� ���� 
		service.updatePerson(new Teacher("0101231234","�ں���","�д�","�ڹ�"));
		//�������� �ʴ� ������ tel�� ������ tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ� 
		service.updatePerson(new Teacher("0101231230","�ں���","�д�","�ڹ�"));
		System.out.println("***�����Ϸ�***");
		
		service.printAll();// 5�� ���
		

	}
}











