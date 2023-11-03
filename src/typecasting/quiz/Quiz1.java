package typecasting.quiz;

/*
 * 8장 15페이지
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Parents a = new Child ("한국", "고", "길동");
		System.out.println(a.lastName);
		System.out.println(a.nationality);
		System.out.println(a.firstName); 
//에러 - 참조변수 a는 Parents에서 옴. Parents클래스에는 firstName 없음.
	}
}

class Parents {
	String nationality;
	String lastName;

	public Parents(String nat, String name) {
		nationality = nat;
		lastName = name;
	}
}

class Child extends Parents {
	String firstName;
	
	public Child (String nam, String nat, String name) {
		super(nat, name); // 부모인 Parents클래스의 생성자 포맷에 맞게
		firstName = nam;
	}	
}