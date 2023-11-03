package inheritance;

/*
 * 클래스 상속받기 (상속)
 * */
public class Ex1 {

	class Parents {

		String nationality; // 국적
		String lastName; // 성

	}

	class Child extends Parents {

		String firstName; // 이름
	}

	public static void main(String[] args) {
		Child child = new Child(); // 먼일이여 왜 오류가
		child.nationality = "한국"; // 부모 클라스에서 온
		child.lastName = " 고"; // 부모 클라스에서 온
		child.firstName = " 길동";

	}

}