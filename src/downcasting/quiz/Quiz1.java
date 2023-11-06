package downcasting.quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<Person> personlist = new ArrayList<Person>();
		personlist.add(new Student("둘리"));
		personlist.add(new Employee("또치"));

//		person.study();  부모클래스의 참조변수로 자손클래스 고유의 변수나 메서드 이용할 수 없다.
//		person.work();	 부모클래스의 참조변수로 자손클래스 고유의 변수나 메서드 이용할 수 없다.

		for (int i = 0; i < personlist.size(); i++) {
			Person person = personlist.get(i); 
		// Person클래스로 선언된 리스트이기때문에 Person클래스로 값들 꺼내야.
		//하지만 이 값들로는 자손클래스의 메서드나 변수 이용못함. 따라서 다운캐스팅을 진행해야 하는것임.

//		for (Person person : personlist) {
//			person.eat()
//		}
			if (person instanceof Student) {
				// 부모클래스의 참조변수 person이 Student클래스타입으로 형변환 가능 한가?
				Student student = (Student) person; // 위의 조건식 만족하면 실행
				student.study();
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				employee.work();
			}
		}

	}

}

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name + "가 밥을 먹는다");
	}
}

class Student extends Person {
	Student(String name) { // 생성자는 상속이 안되서 따로 지정해줘야 함.
		super(name);
	}

	void study() {
		System.out.println(name + "가 공부를 한다.");
	}
}

class Employee extends Person {
	Employee(String name) {
		super(name);
	}

	void work() {
		System.out.println(name + "일을 한다.");
	}

}
