package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		Student student = new Student();
		student.sound(); // 부모의 메서드
		student.eat();	 // 부모의 메서드
		student.study(); // 자식(Student 클래스)의 기능
		
		Professor professor = new Professor ();
		professor.sound();	 // 부모의 메서드
		professor.eat();	 // 부모의 메서드
		professor.work();	// 자식(Professor 클래스)의 기능
	}
}

//사람 클래스
class Person {  // 부모클래스
	public void sound() {
		System.out.println("대화를 한다.");
	}

	public void eat() {
		System.out.println("밥을 먹는다");
	}
}

//학생 클래스
class Student extends Person {  //부모가 Person인 자식 ->학생의 총 기능 : 3개
	public void study() {
		System.out.println("공부를 한다.");
	}
}

//교수 클래스
class Professor extends Person { //부모가 Person인 자식 ->학생의 총 기능 : 3개
	public void work() {
		System.out.println("일을 한다.");
	}
}
