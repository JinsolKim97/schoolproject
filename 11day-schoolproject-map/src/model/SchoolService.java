package model;

import java.util.Iterator;
import java.util.LinkedHashMap;


public class SchoolService {
	// key : tel  value : Person �ڽ� ��ü ( Student, Teacher, Employee )
	private LinkedHashMap<String,Person> map = new LinkedHashMap<String,Person>();
	
	
	public void addPerson(Person person) {
		//tel �ߺ� ������ Ȯ��
		if(map.containsKey(person.getTel())) 
			System.out.println(person.getTel()
					+" tel�� �ش��ϴ� �������� �����Ͽ� ��ϺҰ��մϴ�");
			else 
				map.put(person.getTel(), person);
	}

	public void printAll() {	
		Iterator<Person> it = map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());		
	}

	public Person findPersonByTel(String tel) {
		return map.get(tel);//������ ��Ҹ� ��ȯ, ������ null ��ȯ
	}

	public void deletePersonByTel(String tel) {
		map.remove(tel);	
	}

	public void updatePerson(Person person) {
		if(map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
		}else {
			System.out.println(person.getTel()+"tel�� �������� �ʾ� �����Ұ�");
		}
	}
	
	
	
}
























