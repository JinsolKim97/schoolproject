package model;

import java.util.Iterator;
import java.util.LinkedHashMap;


public class SchoolService {
	// key : tel  value : Person 자식 객체 ( Student, Teacher, Employee )
	private LinkedHashMap<String,Person> map = new LinkedHashMap<String,Person>();
	
	
	public void addPerson(Person person) {
		//tel 중복 유무를 확인
		if(map.containsKey(person.getTel())) 
			System.out.println(person.getTel()
					+" tel에 해당하는 구성원이 존재하여 등록불가합니다");
			else 
				map.put(person.getTel(), person);
	}

	public void printAll() {	
		Iterator<Person> it = map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());		
	}

	public Person findPersonByTel(String tel) {
		return map.get(tel);//있으면 요소를 반환, 없으면 null 반환
	}

	public void deletePersonByTel(String tel) {
		map.remove(tel);	
	}

	public void updatePerson(Person person) {
		if(map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
		}else {
			System.out.println(person.getTel()+"tel이 존재하지 않아 수정불가");
		}
	}
	
	
	
}
























